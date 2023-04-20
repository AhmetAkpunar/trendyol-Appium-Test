Feature: Product

    Scenario: User can buy a product
      Given launch the "trendyol" mobile app
      Then tap gender button
      Then tap account tab
      Then enter email in the "email" field
      Then enter password in the "sifre" field
      Then tap the "Giris Yap" button
      Then tap "anasayfa" tab
      Then tap "search"
      Then search "Logitech mx keys"
      Then add first product to the cart
      Then tap "sepetim" tab
      Then tap "sepeti onayla" button
      Then enter credit card number