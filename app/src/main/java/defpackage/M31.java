package defpackage;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class M31 extends K31 {
    public boolean e;
    public UUID f;
    public byte[] g;

    @Override // defpackage.K31
    public final Object b() {
        UUID uuid = this.f;
        byte[] bArrA = AbstractC7210tN1.a(uuid, null, this.g);
        byte[] bArr = this.g;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String string = sb.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b;
        byte b2 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b2;
        byte b3 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b3;
        byte b4 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b4;
        return new H31(uuid, bArrA, new C1116Ob1[]{new C1116Ob1(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // defpackage.K31
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // defpackage.K31
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.e = false;
        }
    }

    @Override // defpackage.K31
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f = UUID.fromString(attributeValue);
        }
    }

    @Override // defpackage.K31
    public final void k(XmlPullParser xmlPullParser) {
        if (this.e) {
            this.g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
