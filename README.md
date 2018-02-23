# el-extras

additional expression language functions for streamsets to aid in data transformation, validation, 
routing etc.   

### math:
  15 additional math functions from java.lang.math including trig functions and a random integer generator

### regex:
  8 regex functions from java.util.regex.  regex:matches works great for field validation.
  
### string:  
  25 string functions from java.lang.string.  
    these are both new functions and replacements for stock streamsets str: expression language 
    functions offering improved consistency with java.lang.string
### date:
  5 date functions for formatting and calculation.
  specify formats as you would for java.text.SimpleDateFormat.
  
  
to use, jar up and drop el-extras.jar in the streamsets-datacollector/libs-common-lib directory
tested in streamsets 2.7, java 8

