Feature: Kullanici bir urun secip sepete ekleyebilmeli ve odeme yapabilmelidir
  @a101
  Scenario: Kullanici sectigi urunu alabilmedir
    Given  Kullanici "A101AnaSayfa" ya gider
    And Kullanici Cookiesi kabul eder
    Then Kullanici uyelik olusturmadan Giyim Aksesuardan Kadin Ic Giyim kismini daha sonra Dizalti Corap bolumunu secer
    And Siyah corap secer
    And Secilen corabin siyah oldugunu dogrular
    Then Sepete Ekle butonuna tiklar
    And Sepeti Goruntule butonuna tiklar
    And Sepeti Onayla butonuna tiklar
    Then Uye Olmadan Devam et butonuna tiklar
    And Ekrandaki E-mail kutusuna gecerli bir email girer ve devam et butonuna tiklar
    And Yeni adres olustur kismina tiklar
    And Gelen ekrana gecerli adres bilgilerini girer ve Kaydet butonuna tiklar
    And Kargo sirketi secimi yaparak Kaydet ve Devam et butonuna tiklar
    And Kullanici odeme ekranina gidildigini dogrular ve Siparisi Tamamla butonuna tiklar
