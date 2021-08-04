
## List of Changes in the bpmn.ecore

quick and dirty changes instead of using Melange:

- add sub-package: dynamic
- add class dynamic.Token 
- add ref: FlowNode.heldTokens

## Semantics questions

- possibility to start more than one Process simultaneously ? (ex: multiple user asking to book a trip in the Travel agency ?)
- possibility to start more than one Lane simultaneously  for a given Process ?


## Proposed semantics

- StartEvent without incoming MessageFlow 
	- can be triggered anytime
	- create a new token
	
	
## Convertion 	models issus de pragmadev
 - il existe des StartEvent (non affichés) !?