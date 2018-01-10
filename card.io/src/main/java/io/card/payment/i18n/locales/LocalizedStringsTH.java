package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.174790 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsTH implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<>();
    private static Map<String, String> mAdapted = new HashMap<>();

    @Override
    public String getName() {
        return "th";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsTH() {
        mDisplay.put(StringKey.CANCEL, "ยกเลิก");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "เสร็จแล้ว");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "รหัสไปรษณีย์");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "ชื่อผู้ถือบัตร");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "หมดอายุ");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "ดด/ปป");
        mDisplay.put(StringKey.SCAN_GUIDE, "ถือบัตรไว้ตรงนี้\nเครื่องจะสแกนโดยอัตโนมัติ");
        mDisplay.put(StringKey.KEYBOARD, "คีย์บอร์ด…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "หมายเลขบัตร");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "รายละเอียดบัตร");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "อุปกรณ์ไม่สามารถใช้กล้องเพื่ออ่านหมายเลขบัตรได้");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "กล้องของอุปกรณ์ไม่พร้อมใช้งาน");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "อุปกรณ์พบข้อผิดพลาดขณะเปิดกล้อง");

        // no adapted_translations found
    }
}
