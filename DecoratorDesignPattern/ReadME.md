**Decorator Pattern**

It attaches additional responsibilities to an object dynamically. It provide a flexible alternative to subclassing for extending functionality.

Power of Extension at run Time which can be achieved by the power of composition/

Decorators are extending the Component interface for type matching, and they are getting 
the behaviour by composing objects.

Whenever somebody inherit the behaviour by subclassing, that behaviour is set
statically at compile time. In addition, all the subclasses must inherit the same 
behaviour. If however, I can extend an objects behaviour through composition, then I can do
dynamically at run Time.

By Dynamically, composing objects, I can add new functionality by writing the new code
rather than altering existing code. Because I am not changing the existing code so the chances of 
introducing the bugs is very minimal.


One:: If we have code that relies on the concrete Component Type, then decorator will break.
