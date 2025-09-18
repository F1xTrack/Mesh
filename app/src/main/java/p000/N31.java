package p000;

import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class N31 extends K31 {

    /* renamed from: e */
    public C6686qX f7482e;

    /* JADX WARN: Removed duplicated region for block: B:98:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b7  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m5536m(java.lang.String r12) {
        /*
            r0 = 4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto Lba
            int r2 = p000.AbstractC7485Dh1.f2166a
            int r2 = r12.length()
            int r2 = r2 / 2
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = r4
        L18:
            if (r5 >= r2) goto L38
            int r6 = r5 * 2
            char r7 = r12.charAt(r6)
            r8 = 16
            int r7 = java.lang.Character.digit(r7, r8)
            int r7 = r7 << r0
            int r6 = r6 + 1
            char r6 = r12.charAt(r6)
            int r6 = java.lang.Character.digit(r6, r8)
            int r6 = r6 + r7
            byte r6 = (byte) r6
            r3[r5] = r6
            int r5 = r5 + 1
            goto L18
        L38:
            if (r2 > r0) goto L3b
            goto L46
        L3b:
            r12 = r4
        L3c:
            byte[] r5 = p000.AbstractC11362v10.f44086a
            if (r12 >= r0) goto L4c
            r6 = r3[r12]
            r5 = r5[r12]
            if (r6 == r5) goto L49
        L46:
            r12 = 0
            goto Lb1
        L49:
            int r12 = r12 + 1
            goto L3c
        L4c:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r6 = r4
        L52:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r12.add(r7)
            int r6 = r6 + r0
            int r7 = r2 + (-4)
        L5c:
            r8 = -1
            if (r6 > r7) goto L75
            int r9 = r2 - r6
            if (r9 > r0) goto L64
            goto L6f
        L64:
            r9 = r4
        L65:
            if (r9 >= r0) goto L76
            int r10 = r6 + r9
            r10 = r3[r10]
            r11 = r5[r9]
            if (r10 == r11) goto L72
        L6f:
            int r6 = r6 + 1
            goto L5c
        L72:
            int r9 = r9 + 1
            goto L65
        L75:
            r6 = r8
        L76:
            if (r6 != r8) goto L52
            int r0 = r12.size()
            byte[][] r0 = new byte[r0][]
            r5 = r4
        L7f:
            int r6 = r12.size()
            if (r5 >= r6) goto Lb0
            java.lang.Object r6 = r12.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r7 = r12.size()
            int r7 = r7 + (-1)
            if (r5 >= r7) goto La4
            int r7 = r5 + 1
            java.lang.Object r7 = r12.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto La5
        La4:
            r7 = r2
        La5:
            int r7 = r7 - r6
            byte[] r8 = new byte[r7]
            java.lang.System.arraycopy(r3, r6, r8, r4, r7)
            r0[r5] = r8
            int r5 = r5 + 1
            goto L7f
        Lb0:
            r12 = r0
        Lb1:
            if (r12 != 0) goto Lb7
            r1.add(r3)
            goto Lba
        Lb7:
            java.util.Collections.addAll(r1, r12)
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.N31.m5536m(java.lang.String):java.util.ArrayList");
    }

    @Override // p000.K31
    /* renamed from: b */
    public final Object mo4545b() {
        return this.f7482e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    @Override // p000.K31
    /* renamed from: j */
    public final void mo4550j(XmlPullParser xmlPullParser) throws L31 {
        int i = 0;
        C6623pX c6623pX = new C6623pX();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new L31("FourCC", 0);
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int iIntValue = ((Integer) m4546c("Type")).intValue();
        if (iIntValue == 2) {
            ArrayList arrayListM5536m = m5536m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            c6623pX.f40160k = AbstractC8544Xr0.m9171n("video/mp4");
            c6623pX.f40167r = K31.m4543i(xmlPullParser, "MaxWidth");
            c6623pX.f40168s = K31.m4543i(xmlPullParser, "MaxHeight");
            c6623pX.f40164o = arrayListM5536m;
        } else if (iIntValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int iM4543i = K31.m4543i(xmlPullParser, "Channels");
            int iM4543i2 = K31.m4543i(xmlPullParser, "SamplingRate");
            ArrayList arrayListM5536m2 = m5536m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean zIsEmpty = arrayListM5536m2.isEmpty();
            ArrayList arrayListSingletonList = arrayListM5536m2;
            if (zIsEmpty) {
                arrayListSingletonList = arrayListM5536m2;
                if ("audio/mp4a-latm".equals(str)) {
                    int i2 = -1;
                    for (int i3 = 0; i3 < 13; i3++) {
                        if (iM4543i2 == AbstractC1618Zi.f15098a[i3]) {
                            i2 = i3;
                        }
                    }
                    int i4 = -1;
                    while (i < 16) {
                        if (iM4543i == AbstractC1618Zi.f15099b[i]) {
                            i4 = i;
                        }
                        i++;
                    }
                    if (iM4543i2 == -1 || i4 == -1) {
                        throw new IllegalArgumentException(AbstractC7222ym.m26229f(iM4543i2, "Invalid sample rate or number of channels: ", iM4543i, ", "));
                    }
                    arrayListSingletonList = Collections.singletonList(AbstractC1618Zi.m9578a(2, i2, i4));
                }
            }
            c6623pX.f40160k = AbstractC8544Xr0.m9171n("audio/mp4");
            c6623pX.f40175z = iM4543i;
            c6623pX.f40141A = iM4543i2;
            c6623pX.f40164o = arrayListSingletonList;
        } else if (iIntValue == 3) {
            String str2 = (String) m4546c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i = 64;
                } else if (str2.equals("DESC")) {
                    i = 1024;
                }
            }
            c6623pX.f40160k = AbstractC8544Xr0.m9171n("application/mp4");
            c6623pX.f40155f = i;
        } else {
            c6623pX.f40160k = AbstractC8544Xr0.m9171n("application/mp4");
        }
        c6623pX.f40150a = xmlPullParser.getAttributeValue(null, "Index");
        c6623pX.f40151b = (String) m4546c("Name");
        c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
        c6623pX.f40156g = K31.m4543i(xmlPullParser, "Bitrate");
        c6623pX.f40153d = (String) m4546c("Language");
        this.f7482e = new C6686qX(c6623pX);
    }
}
