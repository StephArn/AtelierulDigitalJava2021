package course_9;

import reactor.core.publisher.Flux;

public class ch1 {

    public static Flux<String> emptyFlux(){
        return Flux.empty();
    }

    public static Flux<String> fooBarFlux(){
        return Flux.just("Bar", "Foo");
    }

    public static void main(String[] args) {

    }
}
