# LCWaikiki_Appium
Appium project with 2 scenarios

2 Scenarios (2 passed)
22 Steps (22 passed)
0m31.685s

```markdown
Scenario: Successful Login               # src/test/java/features/01_login.feature:3
  When Tap skip                          # stepDefinitions.login.tap_skip()
  Given Tap Profil                       # stepDefinitions.login.tap_profile()
  Then Enter mail "kubilaycse@gmail.com" # stepDefinitions.login.enter_mail(java.lang.String)
  And Enter password "deneme123"         # stepDefinitions.login.enter_password(java.lang.String)
  And Tap login button                   # stepDefinitions.login.tap_login_button()

Scenario: Successful Order for One Item # src/test/java/features/02_order.feature:3
  Given Tap Kategoriler                 # stepDefinitions.order.tap_kategoriler()
  When Tap Kadın                        # stepDefinitions.order.tap_kadın()
  Then Tap Giyim                        # stepDefinitions.order.tap_giyim()
  And Scroll to "Bluz"                  # stepDefinitions.order.scroll_to_item(java.lang.String)
  And Tap Bluz                          # stepDefinitions.order.tap_bluz()
  And Tap Filtre                        # stepDefinitions.order.tap_filtre()
  And Tap Renk                          # stepDefinitions.order.tap_renk()
  And Filter by colour "Siyah"          # stepDefinitions.order.filter_by_colour(java.lang.String)
  And Tap Siyah                         # stepDefinitions.order.tap_siyah()
  And Tap Uygula                        # stepDefinitions.order.tap_uygula()
  And Tap Sonuçları Listele             # stepDefinitions.order.tap_show_result()
  And Tap 0 item                        # stepDefinitions.order.tap_item_by_order(int)
  And Tap Sepete Ekle                   # stepDefinitions.order.tap_sepete_ekle()
  And Chooice size "S"                  # stepDefinitions.order.chooice_size(java.lang.String)
  And Tap Sepete Ekle                   # stepDefinitions.order.tap_sepete_ekle()
  And Tap Sepetime Git                  # stepDefinitions.order.tap_sepetime_git()
  And Tap ÖDEME ADIMINA GEÇ             # stepDefinitions.order.go_to_payment()
```
