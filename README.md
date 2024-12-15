# NullPointerException in Kotlin's map function

This repository demonstrates a common error in Kotlin: a `NullPointerException` thrown by the `map` function when the input list is null. The `map` function is not designed to handle null values; attempting to call it on a null list will result in a crash.

This issue is common because it's easy to forget that a list might be null.  This example shows both a correct and incorrect way to use the map function with potentially nullable lists.