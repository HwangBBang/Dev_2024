package hello.core.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import static org.assertj.core.api.Assertions.*;

class SingletonTest {
    @Test
    void singletonBeanFind() {
        AnnotationConfigApplicationContext ac
                = new AnnotationConfigApplicationContext(SingletonBean.class);
        SingletonBean singletonBean1 = ac.getBean(SingletonBean.class);
            System.out.println("singletonBean1 = " + singletonBean1);
        SingletonBean singletonBean2 = ac.getBean(SingletonBean.class);
            System.out.println("singletonBean2 = " + singletonBean2);

        assertThat(singletonBean1).isSameAs(singletonBean2); // 싱글톤 -> 같은 인스턴스
        ac.close();
    }

    @Scope("singleton") // 디폴트
    static class SingletonBean {
        @PostConstruct
        public void init() {
            System.out.println("SingletonBean.init");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("SingletonBean.destroy");
        }
    }
    @Scope("prototype") // set prototype scope
    static class PrototypeBean {
        @PostConstruct
        public void init() {

        }

        @PreDestroy
        public void destroy() {

        }
    }
}