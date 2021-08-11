package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.pageCount()); //should == 2
        System.out.println(helper.itemCount()); //should == 6
        System.out.println(helper.pageItemCount(0)); //should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
        System.out.println("*******************");
        System.out.println(helper.pageIndex(0)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(1)); //should == 0
        System.out.println(helper.pageIndex(2)); //should == 0
        System.out.println(helper.pageIndex(3)); //should == 0
        System.out.println(helper.pageIndex(4)); //should == 0
        System.out.println(helper.pageIndex(5)); //should == 0
        System.out.println(helper.pageIndex(6)); //should == 0
        System.out.println(helper.pageIndex(7)); //should == 0

        System.out.println(helper.pageIndex(-10)); //should == -1
    }
}
