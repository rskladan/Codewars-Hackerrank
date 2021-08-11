package com.company;

import java.util.Collections;
import java.util.List;

public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;

    /**
         * The constructor takes in an array of items and a integer indicating how many
         * items fit within a single page
         */
        public PaginationHelper(List<I> collection, int itemsPerPage) {
            this.collection = collection;
            this.itemsPerPage = itemsPerPage;
        }

        /**
         * returns the number of items within the entire collection
         */
        public int itemCount() {
            return collection.size();
        }

        /**
         * returns the number of pages
         */
        public int pageCount() {
            int RoundedUp = (int) Math.ceil((double)collection.size()/itemsPerPage);
            return RoundedUp;

        }

        /**
         * returns the number of items on the current page. page_index is zero based.
         * this method should return -1 for pageIndex values that are out of range
         */
        public int pageItemCount(int pageIndex) {

            if ((collection.size() - ((pageIndex) * itemsPerPage)) > itemsPerPage) {
                return itemsPerPage;
            } else if ((collection.size() - ((pageIndex) * itemsPerPage)) > 0){
                return collection.size() - ((pageIndex) * itemsPerPage);
            } else {
                return -1;
            }
        }

        /**
         * determines what page an item is on. Zero based indexes
         * this method should return -1 for itemIndex values that are out of range
         */
        public int pageIndex(int itemIndex) {
            if (itemIndex < collection.size() && itemIndex >= 0) {
                return itemIndex / itemsPerPage;
            } else {
                return -1;
            }
        }
}
