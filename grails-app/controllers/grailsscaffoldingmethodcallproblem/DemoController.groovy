package grailsscaffoldingmethodcallproblem

class DemoController {

    static scaffold = true

    public testDemoMethod() {
        render this.respondsTo('demoMethod')
    }

    private demoMethod() {
	println "Hi, I'm a method"
    }

}
