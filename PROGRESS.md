#  İlerleme Takibi

> Durum: ⬜ Başlamadı · 🟡 Devam ediyor · ✅ Tamamlandı (teori + pratik + test + review + onay)
>
> Tempo: Günde 1 madde, sindire sindire.
> Döngü: Teori → Kitap örneği → Kavrama soruları → Udemy videosu → Senaryo → Kod → Code review → Test → Commit

---

## Seviye Tespiti

| # | Konu | Sonuç | Not | Kapanacağı Madde |
|---|---|---|---|---|
| 1 | Autoboxing / Integer cache | ✅ | Doğru cevap, neden bilinmiyor (Integer cache, `==` referans karşılaştırır) | 6, 61 |
| 2 | equals & hashCode | ❌ | equals mantığı doğru okundu; HashSet'in önce hashCode'a baktığı bilinmiyor | 10, 11 |
| 3 | Autoboxing performansı | ❌ | Derleme/çalışma hatası beklendi; asıl sorun her turda yeni `Long` nesnesi | 6 |
| 4 | Generics & wildcard | ❌ | Generics'in invariant olması ve `? extends` ile ekleme yapılamaması bilinmiyor | 28, 31 |
| 5 | Stream laziness | ❌ | Terminal operasyon olmadan stream'in çalışmadığı bilinmiyor | 45, 46 |
| 6 | Lambda & effectively final | ❌ | Bilinmiyor | 42 |
| 7 | Utility class tasarımı | ❌ | Bilinmiyor | 4 |
| 8 | Immutability | ❌ | `final` alan = immutable sanılıyor; referans sızıntısı bilinmiyor | 17, 50 |
| 9 | try / finally | ❌ | Hata beklendi; `finally` içindeki return'ün öncekini ezdiği bilinmiyor | 9, 77 |
| 10 | Dependency Injection & test edilebilirlik | 🟡 | "SMTP'ye bağımlılık" sezgisi doğru yönde, kavram ve test etkisi eksik | 5 |

**Genel değerlendirme:** Söz dizimi biliniyor; eksik olan "kaputun altı" modeli. Özellikle şu ayrımlar oturmamış:
- **Derleme hatası mı, çalışma zamanı mı, hiç hata yok mu?** (Soru 3, 4, 9)
- **Referans mı, değer mi?** (`==`, `final` referans, sızan liste — Soru 1, 2, 8)
- **Kod ne zaman çalışır?** (stream laziness, lambda yakalama — Soru 5, 6)

Bu tablonun tamamı kitabın kapsadığı konular. Her madde bitince ilgili satır yeniden test edilecek.

---

## Eksik Konu Takibi

| Konu | İlgili Maddeler | Durum |
|---|---|---|
| Utility Class | 4 | ⬜ |
| Dependency Injection | 5 | ⬜ |
| Autoboxing / Unboxing | 6, 61 | ⬜ |
| equals & hashCode | 10, 11 | ⬜ |
| `==` vs `equals` vs `compareTo` | 1 (mini deney), 10, 14 | 🟡 BigDecimal deneyiyle oturdu, Item 10'da pekişecek |
| Generics | 26–33 | ⬜ |
| EnumSet / EnumMap | 36, 37 | ⬜ |
| Lambda | 42–44 | ⬜ |
| Stream | 45–48 | ⬜ |
| HashSet / Collection seçimi | 64 | ⬜ |
| JUnit 5 / Test yazma | Her madde | ⬜ |
| Git (ileri seviye) | Her madde | 🟡 init, remote, push, branch (`switch -c`), conventional commits |

---

##  Maddeler

### Bölüm 2 — Nesne Oluşturma ve Yok Etme (`chapter02_objects`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 1 | Consider static factory methods instead of constructors | Constructor yerine static factory metotları düşün | 4 | 🟡 |
| 2 | Consider a builder when faced with many constructor parameters | Çok parametrede Builder kullan | 5 | ⬜ |
| 3 | Enforce the singleton property with a private constructor or an enum type | Singleton'ı private constructor veya enum ile garanti et | 6 | ⬜ |
| 4 | Enforce noninstantiability with a private constructor | Örneklenemezliği private constructor ile sağla | 7 | ⬜ |
| 5 | Prefer dependency injection to hardwiring resources | Kaynakları sabitlemek yerine DI kullan | 8 | ⬜ |
| 6 | Avoid creating unnecessary objects | Gereksiz nesne oluşturmaktan kaçın | 9 | ⬜ |
| 7 | Eliminate obsolete object references | Artık kullanılmayan referansları temizle | 10 | ⬜ |
| 8 | Avoid finalizers and cleaners | Finalizer ve cleaner'lardan kaçın | 11 | ⬜ |
| 9 | Prefer try-with-resources to try-finally | try-finally yerine try-with-resources | 11 | ⬜ |

### Bölüm 3 — Tüm Nesnelerde Ortak Metotlar (`chapter03_common_methods`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 10 | Obey the general contract when overriding equals | equals'ı override ederken genel sözleşmeye uy | 12 | ⬜ |
| 11 | Always override hashCode when you override equals | equals'ı override ediyorsan hashCode'u da et | 12 | ⬜ |
| 12 | Always override toString | toString'i her zaman override et | 13 | ⬜ |
| 13 | Override clone judiciously | clone'u dikkatli override et | 14 | ⬜ |
| 14 | Consider implementing Comparable | Comparable'ı uygulamayı düşün | 15 | ⬜ |

### Bölüm 4 — Sınıflar ve Arayüzler (`chapter04_classes_interfaces`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 15 | Minimize the accessibility of classes and members | Erişilebilirliği en aza indir | 16 | ⬜ |
| 16 | In public classes, use accessor methods, not public fields | Public sınıflarda public alan değil erişim metodu kullan | 17 | ⬜ |
| 17 | Minimize mutability | Değiştirilebilirliği en aza indir | 18 | ⬜ |
| 18 | Favor composition over inheritance | Kalıtım yerine kompozisyonu tercih et | 19 | ⬜ |
| 19 | Design and document for inheritance or else prohibit it | Kalıtım için tasarla ve belgele, yoksa yasakla | 20 | ⬜ |
| 20 | Prefer interfaces to abstract classes | Abstract sınıf yerine interface tercih et | 21 | ⬜ |
| 21 | Design interfaces for posterity | Interface'leri geleceği düşünerek tasarla | 21 | ⬜ |
| 22 | Use interfaces only to define types | Interface'leri yalnızca tip tanımlamak için kullan | 22 | ⬜ |
| 23 | Prefer class hierarchies to tagged classes | Etiketli sınıflar yerine sınıf hiyerarşisi | 23 | ⬜ |
| 24 | Favor static member classes over nonstatic | Non-static yerine static iç sınıfları tercih et | 24 | ⬜ |
| 25 | Limit source files to a single top-level class | Bir dosyada tek üst seviye sınıf | 25 | ⬜ |

### Bölüm 5 — Generics (`chapter05_generics`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 26 | Don't use raw types | Raw type kullanma | 26 | ⬜ |
| 27 | Eliminate unchecked warnings | Unchecked uyarıları ortadan kaldır | 27 | ⬜ |
| 28 | Prefer lists to arrays | Dizi yerine liste tercih et | 28 | ⬜ |
| 29 | Favor generic types | Generic tipleri tercih et | 29 | ⬜ |
| 30 | Favor generic methods | Generic metotları tercih et | 30 | ⬜ |
| 31 | Use bounded wildcards to increase API flexibility | API esnekliği için bounded wildcard kullan | 31 | ⬜ |
| 32 | Combine generics and varargs judiciously | Generics ve varargs'ı dikkatli birleştir | 32 | ⬜ |
| 33 | Consider typesafe heterogeneous containers | Tip güvenli heterojen konteynerleri düşün | 33 | ⬜ |

### Bölüm 6 — Enum'lar ve Annotation'lar (`chapter06_enums_annotations`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 34 | Use enums instead of int constants | int sabitleri yerine enum kullan | 34 | ⬜ |
| 35 | Use instance fields instead of ordinals | ordinal yerine instance alanı kullan | 35 | ⬜ |
| 36 | Use EnumSet instead of bit fields | Bit alanları yerine EnumSet kullan | 36 | ⬜ |
| 37 | Use EnumMap instead of ordinal indexing | ordinal indeksleme yerine EnumMap kullan | 37 | ⬜ |
| 38 | Emulate extensible enums with interfaces | Genişletilebilir enum'ları interface ile taklit et | 38 | ⬜ |
| 39 | Prefer annotations to naming patterns | İsimlendirme kalıpları yerine annotation | 39, 40 | ⬜ |
| 40 | Consistently use the Override annotation | @Override'ı tutarlı kullan | 41 | ⬜ |
| 41 | Use marker interfaces to define types | Tip tanımlamak için marker interface kullan | 42 | ⬜ |

### Bölüm 7 — Lambda'lar ve Stream'ler (`chapter07_lambdas_streams`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 42 | Prefer lambdas to anonymous classes | Anonim sınıf yerine lambda tercih et | 43 | ⬜ |
| 43 | Prefer method references to lambdas | Lambda yerine method reference tercih et | 44 | ⬜ |
| 44 | Favor the use of standard functional interfaces | Standart fonksiyonel interface'leri kullan | 45 | ⬜ |
| 45 | Use streams judiciously | Stream'leri yerinde kullan | 46 | ⬜ |
| 46 | Prefer side-effect-free functions in streams | Stream'lerde yan etkisiz fonksiyonlar | 47 | ⬜ |
| 47 | Prefer Collection to Stream as a return type | Dönüş tipinde Stream yerine Collection | 48 | ⬜ |
| 48 | Use caution when making streams parallel | Paralel stream'lerde dikkatli ol | 49 | ⬜ |

### Bölüm 8 — Metotlar (`chapter08_methods`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 49 | Check parameters for validity | Parametrelerin geçerliliğini kontrol et | 50 | ⬜ |
| 50 | Make defensive copies when needed | Gerektiğinde savunmacı kopya oluştur | 51 | ⬜ |
| 51 | Design method signatures carefully | Metot imzalarını dikkatli tasarla | 52 | ⬜ |
| 52 | Use overloading judiciously | Overloading'i dikkatli kullan | 53 | ⬜ |
| 53 | Use varargs judiciously | Varargs'ı dikkatli kullan | 54 | ⬜ |
| 54 | Return empty collections or arrays, not nulls | null değil boş koleksiyon döndür | 55 | ⬜ |
| 55 | Return optionals judiciously | Optional'ı yerinde döndür | 56 | ⬜ |
| 56 | Write doc comments for all exposed API elements | Dışa açık API'ye Javadoc yaz | 57 | ⬜ |

### Bölüm 9 — Genel Programlama (`chapter09_general_programming`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 57 | Minimize the scope of local variables | Yerel değişkenlerin kapsamını küçült | 58 | ⬜ |
| 58 | Prefer for-each loops to traditional for loops | Klasik for yerine for-each | 59 | ⬜ |
| 59 | Know and use the libraries | Kütüphaneleri tanı ve kullan | 60 | ⬜ |
| 60 | Avoid float and double if exact answers are required | Kesin sonuç gerekiyorsa float/double kullanma | 61 | ⬜ |
| 61 | Prefer primitive types to boxed primitives | Kutulu tipler yerine primitive | 62 | ⬜ |
| 62 | Avoid strings where other types are more appropriate | Uygun tip varken String kullanma | 63 | ⬜ |
| 63 | Beware the performance of string concatenation | String birleştirme performansına dikkat | 64 | ⬜ |
| 64 | Refer to objects by their interfaces | Nesnelere interface üzerinden referans ver | 65 | ⬜ |
| 65 | Prefer interfaces to reflection | Reflection yerine interface tercih et | 39 | ⬜ |
| 66 | Use native methods judiciously | Native metotları dikkatli kullan | 66 | ⬜ |
| 67 | Optimize judiciously | Optimizasyonu dikkatli yap | 66 | ⬜ |
| 68 | Adhere to generally accepted naming conventions | Genel isimlendirme kurallarına uy | 66 | ⬜ |

### Bölüm 10 — Exception'lar (`chapter10_exceptions`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 69 | Use exceptions only for exceptional conditions | Exception'ı sadece istisnai durumlar için kullan | 67 | ⬜ |
| 70 | Use checked exceptions for recoverable conditions and runtime exceptions for programming errors | Kurtarılabilir → checked, programlama hatası → runtime | 67 | ⬜ |
| 71 | Avoid unnecessary use of checked exceptions | Gereksiz checked exception'dan kaçın | 67 | ⬜ |
| 72 | Favor the use of standard exceptions | Standart exception'ları tercih et | 68 | ⬜ |
| 73 | Throw exceptions appropriate to the abstraction | Soyutlama seviyesine uygun exception fırlat | 68 | ⬜ |
| 74 | Document all exceptions thrown by each method | Fırlatılan tüm exception'ları belgele | 68 | ⬜ |
| 75 | Include failure-capture information in detail messages | Hata mesajına teşhis bilgisi ekle | 68 | ⬜ |
| 76 | Strive for failure atomicity | Hata atomikliğini sağla | 68 | ⬜ |
| 77 | Don't ignore exceptions | Exception'ları yutma | 68 | ⬜ |

### Bölüm 11 — Eşzamanlılık (`chapter11_concurrency`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 78 | Synchronize access to shared mutable data | Paylaşılan değişken veriye erişimi senkronize et | 69 | ⬜ |
| 79 | Avoid excessive synchronization | Aşırı senkronizasyondan kaçın | 70 | ⬜ |
| 80 | Prefer executors, tasks, and streams to threads | Thread yerine executor ve task kullan | 71 | ⬜ |
| 81 | Prefer concurrency utilities to wait and notify | wait/notify yerine concurrency araçları | 72 | ⬜ |
| 82 | Document thread safety | Thread güvenliğini belgele | 73 | ⬜ |
| 83 | Use lazy initialization judiciously | Lazy initialization'ı dikkatli kullan | 73 | ⬜ |
| 84 | Don't depend on the thread scheduler | Thread zamanlayıcıya güvenme | 73 | ⬜ |

### Bölüm 12 — Serileştirme (`chapter12_serialization`)

| # | Madde | Türkçe Özet | Udemy | Durum |
|---|---|---|---|---|
| 85 | Prefer alternatives to Java serialization | Java serialization yerine alternatifler | 74 | ⬜ |
| 86 | Implement Serializable with great caution | Serializable'ı çok dikkatli uygula | 75 | ⬜ |
| 87 | Consider using a custom serialized form | Özel serileştirilmiş form düşün | 75 | ⬜ |
| 88 | Write readObject methods defensively | readObject'i savunmacı yaz | 76 | ⬜ |
| 89 | For instance control, prefer enum types to readResolve | Örnek kontrolü için readResolve yerine enum | 76 | ⬜ |
| 90 | Consider serialization proxies instead of serialized instances | Serialization proxy kullanmayı düşün | 77 | ⬜ |

**Bonus:** Udemy 79 — Cyclomatic Complexity

---

## Çalışma Günlüğü

| Tarih | Madde | Not |
|---|---|---|
| 2026-10-24 | — | Repo kuruldu, GitHub'a ilk push yapıldı, seviye testi yapıldı |
| 2026-10-25 | 1 | Teori + `solution` paketi (Discount) yazıldı, code review düzeltmeleri yapıldı, 7 kavrama sorusu, `==`/`equals`/`compareTo` deneyi. Sırada: Udemy 4 → `book` → `practice` + ilk JUnit testi |