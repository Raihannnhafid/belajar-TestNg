# Priority

## Pakai Priority

- Method SignInTest.dashboardTest dijalankan
- Method SignInTest.sigIntest dijalankan
- Method SignInTest.profilTest dijalankan

## Tanpa Priority

- Method SignInTest.dashboardTest dijalankan
- Method SignInTest.profilTest dijalankan
- Method SignInTest.sigIntest dijalankan

## Enabled Attribute

- ### menonaktifkan method

@Test(priority = 1, enabled = false)
public void dashboardTest() {
System.out.println("Method SignInTest.dashboardTest dijalankan");
}
