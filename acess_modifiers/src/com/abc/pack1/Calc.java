package com.abc.pack1;
class Calc {
	 static final double PI_VALUE = 3.14;
	 int findSquare(int num) {
		 return num*num;
		 
	 }
   int findCube(int num) {
	return num*num*num;
}
}
/*
modifier    class    same _package  outside _package
--------   -----     -------------   -----------
private      yes      no              no
default      yes      yes             no
protected    yes      yes   yes(within child class)
public       yes      yes              yes
an exception is unwanted or unexpected event that disturbs normal flow of exceptions -
an exception whic is checked by complier is checked exception
an exception which are not checked by complier is unchecked complier
error due to lack of some system resources errors occured that are like out of memory eror is error exception. 
*/