class ProductOfNumbers {
    private List<Integer> prefixProducts;
    
    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); // Initialize with 1 for multiplication convenience
    }
    
    public void add(int num) {
        if (num == 0) {
            prefixProducts = new ArrayList<>();
            prefixProducts.add(1); // Reset the prefix product list when a zero is added
        } else {
            prefixProducts.add(prefixProducts.get(prefixProducts.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProducts.size();
        if (k >= n) return 0; // If k extends beyond last zero, product is zero
        return prefixProducts.get(n - 1) / prefixProducts.get(n - 1 - k);
    }
}
