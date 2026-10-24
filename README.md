#Effective Java Recaps — Türkçe

> Joshua Bloch'un **Effective Java (3. Baskı)** kitabındaki 90 maddenin (item) tamamının
> Türkçe açıklamalar, gerçek hayat senaryoları ve JUnit 5 testleriyle uygulamalı olarak işlendiği eğitim reposu.

Bu repo bir "kitap özeti" değildir. Her madde için:

1. **Sorun** — Bu madde hangi gerçek problemi çözmek için var?
2. **Yanlış yaklaşımlar** — Sektörde sık görülen hatalı çözümler ve neden çöktükleri (anti-pattern'ler)
3. **Doğru yaklaşım** — Kitabın önerdiği çözüm, karşılaştırmalı olarak
4. **Gerçek hayat senaryosu** — E-ticaret, bankacılık, sipariş, rezervasyon gibi alanlardan uygulama
5. **Testler** — Davranışı kanıtlayan JUnit 5 testleri

---

## Repo Nasıl Gezilir?

Her maddenin kodu **tek bir pakette** toplanır. Merak ettiğin konuya doğrudan gidebilirsin:

```
src/main/java/com/sandalliyasarcan/
└── chapterXX_<bölüm>/
    └── itemYY_<konu>/
        ├── problem/    → Yanlış / eksik yaklaşım (anti-pattern)
        ├── book/       → Kitaptaki örneğin Türkçe yorumlu hali
        └── practice/   → Gerçek hayat senaryosu
```

| Klasör | İçerik |
|---|---|
| `src/main/java/...` | Örnek kodlar |
| `src/test/java/...` | Aynı paket yapısında JUnit 5 testleri |
| `docs/chapterXX/` | Her maddenin Türkçe ders notu (teori, karşılaştırma tabloları, mülakat soruları) |
| `PROGRESS.md` | 90 maddenin tam listesi, ilerleme durumu ve Udemy eşleştirmesi |

---

## Bölümler

| Bölüm | Konu | Maddeler | Paket |
|---|---|---|---|
| 2 | Nesne Oluşturma ve Yok Etme | 1–9 | `chapter02_objects` |
| 3 | Tüm Nesnelerde Ortak Metotlar | 10–14 | `chapter03_common_methods` |
| 4 | Sınıflar ve Arayüzler | 15–25 | `chapter04_classes_interfaces` |
| 5 | Generics | 26–33 | `chapter05_generics` |
| 6 | Enum'lar ve Annotation'lar | 34–41 | `chapter06_enums_annotations` |
| 7 | Lambda'lar ve Stream'ler | 42–48 | `chapter07_lambdas_streams` |
| 8 | Metotlar | 49–56 | `chapter08_methods` |
| 9 | Genel Programlama | 57–68 | `chapter09_general_programming` |
| 10 | Exception'lar | 69–77 | `chapter10_exceptions` |
| 11 | Eşzamanlılık (Concurrency) | 78–84 | `chapter11_concurrency` |
| 12 | Serileştirme (Serialization) | 85–90 | `chapter12_serialization` |

> Bölüm 1 kitabın giriş bölümüdür, kod içermez.

### Ek Paketler

| Paket | İçerik |
|---|---|
| `patterns` | Kitapta doğrudan işlenmeyen GoF tasarım desenleri (ilgili maddelerin yanında ele alınır) |
| `modernjava` | Kitaptan sonra gelen Java özellikleri: `record`, `sealed`, pattern matching, switch expressions vb. |

---

## Teknolojiler

- **Java 21** (LTS)
- **Maven**
- **JUnit 5**
- **SQL Server / Oracle** (JDBC ile, ilgili maddelerde)
- Framework yok — tamamen **saf Java**. Amaç, framework'lerin arkasında saklanan mekanizmaları elle yazarak öğrenmek.

## ▶️ Çalıştırma

```bash
git clone https://github.com/<kullanici-adi>/EffectiveJavaRecaps.git
cd EffectiveJavaRecaps
mvn test
```

Her `practice` paketindeki `*Demo` sınıfları IntelliJ IDEA üzerinden doğrudan çalıştırılabilir.

---

## Kod Kuralları

- Kod (sınıf, metot, değişken adları) **İngilizce**; açıklamalar ve dokümanlar **Türkçe**.
- Paket isimlerinde okunabilirlik için bilinçli olarak `_` kullanılmıştır (`item01_static_factory`).
  Gerçek projelerde Java paket isimleri genelde alt çizgisiz ve küçük harflidir.
- Commit mesajları [Conventional Commits](https://www.conventionalcommits.org/) formatındadır:
  `feat(item01): ...`, `test(item01): ...`, `docs(item01): ...`

## Kaynaklar

- Joshua Bloch — *Effective Java, 3rd Edition* (Addison-Wesley, 2018)
- Udemy — Türkçe Effective Java kursu (madde eşleştirmesi `PROGRESS.md` içinde)

---

> Bu repo kişisel bir öğrenme yolculuğunun ürünüdür. Kitabın yerine geçmez; kitabı okumaya ve anlamaya yardımcı olmayı amaçlar.