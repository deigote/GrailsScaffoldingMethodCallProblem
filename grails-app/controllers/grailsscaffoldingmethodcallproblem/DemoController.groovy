package grailsscaffoldingmethodcallproblem

class DemoController {

    static scaffold = true

    public testDemoMethod() {
        println this.respondsTo('demoMethod')
	render demoMethod()
    }

    private demoMethod() {
	"Hi, I'm a method"
    }

}
