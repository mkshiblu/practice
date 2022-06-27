package extract;

import angular.mocks.Function;
import angular.mocks.Function.StringVar;


/*
var ARROW_ARG = /^([^(]+?)=>/;
var FN_ARGS = /^[^(]*\(\s*([^)]*)\)/m;
var FN_ARG_SPLIT = /,/;
var FN_ARG = /^\s*(_?)(\S+?)\1\s*$/;
var STRIP_COMMENTS = /((\/\/.*$)|(\/\*[\s\S]*?\*\/))/mg;
var $injectorMinErr = minErr('$injector');

function stringifyFn(fn) {
  return Function.prototype.toString.call(fn);
}

function extractArgs(fn) {
  var fnText = stringifyFn(fn).replace(STRIP_COMMENTS, ''),
      args = fnText.match(ARROW_ARG) || fnText.match(FN_ARGS);
  return args;
}
 */
public class Injector {
	String ARROW_ARG = "/^([^(]+?)=>/";
	String FN_ARGS = "/^[^(]*\\(\\s*([^)]*)\\)/m";
	String STRIP_COMMENTS = "/((\\/\\/.*$)|(\\/\\*[\\s\\S]*?\\*\\/))/mg";
	

	
	StringVar stringifyFn(Object fn) {
	  return Function.prototype.toString.call(fn);
	}
		
	StringVar extractArgs(Object fn) {
		
		StringVar fnText =  stringifyFn(fn).replace(STRIP_COMMENTS, ""),
				args = fnText.match(ARROW_ARG).match(FN_ARGS);
		
		return args;
	}
}
