GrailsScaffoldingMethodCallProblem
==================================

A tiny project to demostrate the controller scaffolding problem described in http://stackoverflow.com/questions/16332787/controller-method-not-found-if-called-from-scaffolding-template

If you run-app the project and visit:
 - http://localhost:8080/GrailsScaffoldingMethodCallProblem/demo/testDemoMethod: everything is fine, the demoMethod is found and executed properly
 - http://localhost:8080/GrailsScaffoldingMethodCallProblem/demo/index: the demoMethod method is not found hence an exception is thrown.

Relevant classes:
 - https://github.com/deigote/GrailsScaffoldingMethodCallProblem/blob/master/src/templates/scaffolding/Controller.groovy
 - https://github.com/deigote/GrailsScaffoldingMethodCallProblem/blob/master/grails-app/controllers/grailsscaffoldingmethodcallproblem/DemoController.groovy
