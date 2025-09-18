package p000;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class M31 extends K31 {

    /* renamed from: e */
    public boolean f6979e;

    /* renamed from: f */
    public UUID f6980f;

    /* renamed from: g */
    public byte[] f6981g;

    @Override // p000.K31
    /* renamed from: b */
    public final Object mo4545b() {
        UUID uuid = this.f6980f;
        byte[] bArrM24915a = AbstractC11154tN1.m24915a(uuid, null, this.f6981g);
        byte[] bArr = this.f6981g;
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
        return new H31(uuid, bArrM24915a, new C8045Ob1[]{new C8045Ob1(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // p000.K31
    /* renamed from: d */
    public final boolean mo4547d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // p000.K31
    /* renamed from: f */
    public final void mo4549f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f6979e = false;
        }
    }

    @Override // p000.K31
    /* renamed from: j */
    public final void mo4550j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f6979e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f6980f = UUID.fromString(attributeValue);
        }
    }

    @Override // p000.K31
    /* renamed from: k */
    public final void mo4551k(XmlPullParser xmlPullParser) {
        if (this.f6979e) {
            this.f6981g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
