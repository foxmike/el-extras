# el-extras

additional expression language functions for streamsets to aid in data transformation, validation, 
routing etc. using this highly extensible product  

### included

  14 additional math functions from java.lang.math including trig functions and a random integer generator

  9 regex functions from java.util.regex.  regexmatches can be used for field validation.
  
  25 string functions from java.lang.string.  
    these are both new functions and replacements for stock streamsets str expressions language 
    functions offering improved consistency with java.lang.string
    
to use, jar up and drop el-extras.jar in the streamsets-datacollector/libs-common-lib directory
tested in streamsets 2.7, java 8

### enjoy!
