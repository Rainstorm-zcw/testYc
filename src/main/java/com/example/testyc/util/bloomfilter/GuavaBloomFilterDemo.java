package com.example.testyc.util.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class GuavaBloomFilterDemo {

    public static void main(String[] args){
        BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(),10000,0.01);
        for (int i = 0; i < 10000; i++) {
            bloomFilter.put(i);
        }
        System.out.println(bloomFilter.mightContain(1));
        System.out.println(bloomFilter.mightContain(2));
        System.out.println(bloomFilter.mightContain(3));
        System.out.println(bloomFilter.mightContain(100001));
        System.out.println(bloomFilter.approximateElementCount());
    }
}
