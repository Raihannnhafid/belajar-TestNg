# Parameter TestNG

### 1. Buat paramater pada file testng.xml
```html
<parameter name="username" value="johansebastian"></parameter>
<parameter name="password" value="123qwe"></parameter>
```

### 2. Class dan Inisialisasi
```java
public class SignInTest {
  private SignIn signIn;
```
* `SignInTest` : class utama. 
* `private SignIn signIn` : Object daru class SignIn yang berisikan method setUsername,setPassword, dan clikButtonSignIn.

### 3. Setup sebelum test berjalan
```java
  @BeforeClass
  public void  setup(){
    signIn = new SignIn();
  }
```
* Method ini akan dijalankan satu kali sebelum semua test.
* Tujuannya untuk menginisialisasi objek signIn, agar bisa digunakan dalam semua test case.

### 4. Test Input Username
```java
@Test(priority = 1)
  @Parameters("username")
  public void fillUsername(String username){
    signIn.setUsername(username);
    Assert.assertEquals(username, signIn.getUsername());
  }
```
* Test ini menerima parameter `username` dari `testng.xml`.
* Memanggil `setUsername()` untuk mengisi username.
* Lalu dicek apakah hasil dari `getUsername()` sama dengan input `username`.
* `priority = 1`: Test ini akan dijalankan pertama.

### Test Input Password
```java
 @Test(priority = 2)
  @Parameters("password")
  public void fillPassword(String password){
    signIn.setPassword(password);
    Assert.assertEquals(password, signIn.getPassword());
  }
```
* Sama seperti `fillUsername()`, tapi untuk password.
* Diambil dari parameter `password` di file `testng.xml`.
* Test ini dijalankan setelah username, karena `priority = 2`.

### 6. Test Klik Tombol Sign In
```java
@Test(priority = 3)
  public void clickButtonSignIn(){
    boolean actual = signIn.clickButtonSignIn();
    Assert.assertTrue(actual);
  }
}
```
* Test ini tidak pakai parameter.
* Memanggil method `clickButtonSignIn()` yang harus mengembalikan `true` jika berhasil.
* Lalu dicek apakah hasilnya benar `(true)` pakai `Assert.assertTrue()`.

### Test Flow :
1. Buat objek SignIn
2. Isi username → cek
3. Isi password → cek
4. Klik tombol Sign In → cek berhasil