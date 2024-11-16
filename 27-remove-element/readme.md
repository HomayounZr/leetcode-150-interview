### Remove elements of value "val" inplace
remove all elements with a specific value in array
also shift all the non-val items into the beggining of the array without loss of order
all the above operations must be done in-place

### Solution
use two pointers, slow and fast
iterate the array until the fast pointer reaches the end of the array
increase the slow and fast pointer in each step
when seeing a "val" item in slow pointer, go ahead using fast pointer until you see a non-val item
replace the values of fast and slow pointer in array
the slow pointer index also represents the number of non-val items