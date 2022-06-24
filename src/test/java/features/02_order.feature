Feature: Orders

  Scenario: Successful Order for One Item
    Given Tap Kategoriler
    When Tap Kadın
    Then Tap Giyim
    And Scroll to "Bluz"
    And Tap Bluz
    And Tap Filtre
    And Tap Renk
    And Filter by colour "Siyah"
    And Tap Siyah
    And Tap Uygula
    And Tap Sonuçları Listele
    And Tap 0 item
    And Tap Sepete Ekle
    And Chooice size "S"
    And Tap Sepete Ekle
    And Tap Sepetime Git
    And Tap ÖDEME ADIMINA GEÇ