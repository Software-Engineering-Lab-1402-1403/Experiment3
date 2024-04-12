# پیام رسان قزمیت :)
این یک برنامه خیلی کوچکی است که هر دوست عزیزی با هر سوادی (حتی سواد اول دبستان .. خخخ) می‌تواند بنویسد. ما قصد داریم این برنامه را به منظور یادگیری اصول شی گرایی به صورت عملی در اختیار دانشجویان عزیز و فرهیخته ای که در دانشکده مهندسی کامپیوتر و در بهار 1403 درس آز مهندسی نرم افزار را اخذ کرده اند قرار دهیم تا آن را اصلاح کنند.


<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن کلاس جدید پیام تلگرامی </p>
</td>
<td width="292">
<p>افزودن کلاسی که کلاس Message را ارث‌بری می‌کند و برای آیدی مبدا و مقصد توابع گتر و ستر ایجاد شد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن کلاس جدید سرویس پیام تلگرامی </p>
</td>
<td width="292">
<p>افزودن کلاسی که کلاس MessageService را ارث‌بری می‌کند و شامل تمام توابع داخل این تابع می‌باشد. همینطور سه تابعی که در واسط پدر قرار دارند باید در این کلاس حضور پیدا کنند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع جدید sendTelegramMessage به این واسط </p>
</td>
<td width="292">
<p>نیاز بود در این واسط این تابع را قرار دهیم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>EmailMessageService</p>
</td>
<td width="141">
<p>افزودن تابع جدید sendTelegramMessage به این کلاس </p>
</td>
<td width="292">
<p>چون این کلاس از واسط MessageService ارث‌بری می‌کرد پس حتما باید این تابع جدید را در خود داشته باشد </p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>SmsMessageService</p>
</td>
<td width="141">
<p>  افزودن تابع جدید sendTelegramMessage به این کلاس</p>
</td>
<td width="292">
<p> چون این کلاس از واسط MessageService ارث‌بری می‌کرد پس حتما باید این تابع جدید را در خود داشته باشد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>


نقض هر کدام از اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

ارائه راهکار برای هرکدام:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

تعداد تفییرات مورد نیاز بعد از اصلاح موارد SOLID

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
