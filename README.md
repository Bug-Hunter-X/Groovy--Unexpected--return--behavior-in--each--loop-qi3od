# Groovy Each Loop Return Behavior

This example demonstrates a common pitfall in Groovy when using the `each` method with lists.  The `return` statement inside the `each` closure only exits the loop, not the enclosing method.  This can be counter-intuitive and lead to bugs if not properly understood.

## Problem

The provided Groovy code is intended to print a list of strings until it encounters the string "exit".  At that point, it should stop processing the list and exit the method.

However, the `return` statement within the `each` loop does not exit the `myMethod` function.  It only exits the current iteration of the `each` loop.

## Solution

A corrected version is provided that uses a more appropriate approach to handle early termination of the method.