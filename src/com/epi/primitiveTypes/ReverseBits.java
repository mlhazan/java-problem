
package com.epi.primitiveTypes;

public class ReverseBits {
  private static final int[] precomputedReverse = new int[(1 << 8)];

  private static int reverseBits(int x, int n) {
    for (int i = 0, j = n; i < j; ++i, --j) {
      x = (int) SwapBits.swapBits(x, i, j);
    }
    return x;
  }

  private static void createPrecomputedTable() {
    for (int i = 0; i < (1 << 8); ++i) {
      precomputedReverse[i] = reverseBits(i, 7);
    }
  }

  public static int reverseBits(int x) {
    final int WORD_SIZE = 8;
    final int BIT_MASK = 0xFF;
    
    return precomputedReverse[(int)(x & BIT_MASK)] << (3 * WORD_SIZE)
           | precomputedReverse[(int)((x >>> WORD_SIZE) & BIT_MASK)]
                 << (2 * WORD_SIZE)
           | precomputedReverse[(int)((x >>> (2 * WORD_SIZE)) & BIT_MASK)]
                 << WORD_SIZE
           | precomputedReverse[(int)((x >>> (3 * WORD_SIZE)) & BIT_MASK)];
   
  }
 

  public static void main(String[] args) {
    createPrecomputedTable();
     
        int x = 2141400;
        System.out.println("x = " + x + ", reverseBits(x) = " + reverseBits(x));
       
  }
}