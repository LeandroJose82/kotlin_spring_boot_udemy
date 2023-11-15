package lj

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong ()

    @RequestMapping ("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "Alô Mundo")name:String?) :Greeting {

        return Greeting(counter.incrementAndGet(),"$name")
    }
}