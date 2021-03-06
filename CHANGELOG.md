# Version 3.1.0 (2018-01-30)

* [new] Java 9 compatibility.
* [new] Ability to register change listeners that will be called on refresh if the nodes they are interested in change.
* [new] Ability to automatically refresh the configuration on YAML/JSON/Properties file change.
* [fix] Fix resolution of nested macros.

# Version 3.0.1 (2017-08-03)

* [fix] Fix handling of colon (:) inside macro quoted values (i.e. ${'1:2:3'}).
* [fix] Fix the ability to map maps with null values.

# Version 3.0.0 (2017-07-31)

* [brk] Remove node attributes.
* [brk] API cleanup.
* [brk] When converting an array node to a map node, items are used as keys instead of values.
* [chg] Compatibility with Jackson 2.8.0+. 
* [fix] Properly parse and handle null values.

# Version 2.1.1 (2017-06-07)

* [fix] Fix instantiation of arrays as default values.

# Version 2.1.0 (2017-04-28)

* [new] Mapper for durations.
* [chg] Map properties files as in-depth trees (not flat keys at the top-level).

# Version 2.0.1 (2017-02-20)

* [fix] Fix formatting of configuration YAML dump.

# Version 2.0.0 (2017-02-16)

* [brk] Replace immutable/mutable dual data-structure with a single one and an unmodifiable wrapper.
* [brk] Replace collections by streams when accessing nodes.
* [brk] API refactoring
* [chg] Add debug and trace logging for main configuration operations (create, fork, refresh, get).
* [chg] No provider is registered by default anymore.
* [chg] No processor is registered by default anymore.
* [chg] No evaluator is registered by default anymore.

# Version 1.1.0 (2017-01-12)

* [new] Allow to ignore macro and function resolution by escaping them with `\`.  
* [new] Visit superclasses when gathering field info for object mapping.
* [new] Add a mapper for configuration builders (i.e. objects that provide functions for configuration). 

# Version 1.0.0 (2016-12-12)

* [new] Initial version.
