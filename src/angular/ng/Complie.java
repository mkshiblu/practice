package angular.ng;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import static angular.mocks.MockImport.createMap;
import static angular.mocks.MockImport.$controller;
import static angular.mocks.MockImport.controller;

import angular.mocks.CompileContext;
import angular.mocks.Controller;
import angular.mocks.Directive;
import angular.mocks.Element;

public class Complie {
	public void applyDirectivesToNode(Consumer<Integer> transcludeFn, int originalReplaceDirective,
			Consumer<Integer> preLinkFns, Consumer<Integer> postLinkFns, CompileContext previousCompileContext) {

		previousCompileContext = previousCompileContext != null ? previousCompileContext : new CompileContext();

		Object terminalPriority = -Integer.MAX_VALUE, newScopeDirective = previousCompileContext.newScopeDirective,
				controllerDirectives = previousCompileContext.controllerDirectives,
				newIsolateScopeDirective = previousCompileContext.newIsolateScopeDirective;
	}

	void nodeLinkFn(Object scope, HashMap<String, Directive> controllerDirectives, Directive newIsolateScopeDirective) {
		Object i, isolateScope = null, controllerScope, transcludeFn = null;
		Map<String, Controller> elementControllers = null;
		Element $element = null;
		Map<String, Character> attrs = null;

		controllerScope = scope;
		if (controllerDirectives != null) {
			elementControllers = setupControllers($element, attrs, transcludeFn, controllerDirectives, isolateScope,
					scope, newIsolateScopeDirective);
		}
		// Initialize bindToController bindings
		for (var name : elementControllers.keySet()) {
			var controllerDirective = controllerDirectives.get(name);
			var controller = elementControllers.get(name);
			var bindings = controllerDirective.$$bindings.bindToController;

			controller.instance = controller();
			$element.data('$' + controllerDirective.name + "Controller", controller.instance);
			controller.bindingInfo = initializeDirectiveBindings(controllerScope, attrs, controller.instance, bindings,
					controllerDirective);
		}
	}

	Map<String, Controller> setupControllers(Element $element, Map<String, Character> attrs, Object transcludeFn,
			HashMap<String, Directive> controllerDirectives, Object isolateScope, Object scope,
			Directive newIsolateScopeDirective) {
		var elementControllers = createMap();
		for (var controllerKey : controllerDirectives.keySet()) {
			var directive = controllerDirectives.get(controllerKey);
			var locals = new Object() {
				Object $scope = directive == newIsolateScopeDirective || directive.$$isolateScope == null ? isolateScope
						: scope;
				Object $$element = $element;
				Object $attrs = attrs;
				Object $transclude = transcludeFn;

			};
			var controller = directive.controller;
			if (controller == '@') {
				controller = attrs.get(directive.name);
			}

			var controllerInstance = $controller(controller, locals, true, directive.controllerAs);
			elementControllers.put(directive.name, controllerInstance);
			$element.data('$' + directive.name + "Controller", controllerInstance.instance);
		}
		return elementControllers;
	}
	


	private Object initializeDirectiveBindings(Object controllerScope, Map<String, Character> attrs,
			Controller instance, Object bindings, Directive controllerDirective) {
		return null;
	}
}
