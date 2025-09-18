package defpackage;

import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class O31 extends K31 {
    public final LinkedList e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public H31 m;

    public O31(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.m = null;
        this.e = new LinkedList();
    }

    @Override // defpackage.K31
    public final void a(Object obj) {
        if (obj instanceof I31) {
            this.e.add((I31) obj);
        } else if (obj instanceof H31) {
            YN1.f(this.m == null);
            this.m = (H31) obj;
        }
    }

    @Override // defpackage.K31
    public final Object b() {
        boolean z;
        H31 h31;
        int i;
        long jY;
        long jY2;
        LinkedList linkedList = this.e;
        int size = linkedList.size();
        I31[] i31Arr = new I31[size];
        linkedList.toArray(i31Arr);
        H31 h312 = this.m;
        if (h312 != null) {
            JL jl = new JL(new IL(h312.a, null, "video/mp4", h312.b));
            for (int i2 = 0; i2 < size; i2++) {
                I31 i31 = i31Arr[i2];
                int i3 = i31.a;
                if (i3 == 2 || i3 == 1) {
                    int i4 = 0;
                    while (true) {
                        C6666qX[] c6666qXArr = i31.j;
                        if (i4 < c6666qXArr.length) {
                            C6475pX c6475pXA = c6666qXArr[i4].a();
                            c6475pXA.p = jl;
                            c6666qXArr[i4] = new C6666qX(c6475pXA);
                            i4++;
                        }
                    }
                }
            }
        }
        int i5 = this.f;
        int i6 = this.g;
        long j = this.h;
        long j2 = this.i;
        long j3 = this.j;
        int i7 = this.k;
        boolean z2 = this.l;
        H31 h313 = this.m;
        if (j2 == 0) {
            z = z2;
            h31 = h313;
            i = i7;
            jY = -9223372036854775807L;
        } else {
            int i8 = AbstractC0277Dh1.a;
            z = z2;
            h31 = h313;
            i = i7;
            jY = AbstractC0277Dh1.Y(j2, 1000000L, j, RoundingMode.FLOOR);
        }
        if (j3 == 0) {
            jY2 = -9223372036854775807L;
        } else {
            int i9 = AbstractC0277Dh1.a;
            jY2 = AbstractC0277Dh1.Y(j3, 1000000L, j, RoundingMode.FLOOR);
        }
        return new J31(i5, i6, jY, jY2, i, z, h31, i31Arr);
    }

    @Override // defpackage.K31
    public final void j(XmlPullParser xmlPullParser) throws C5643lA0 {
        this.f = K31.i(xmlPullParser, "MajorVersion");
        this.g = K31.i(xmlPullParser, "MinorVersion");
        this.h = K31.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new L31("Duration", 0);
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.j = K31.h(xmlPullParser, "DVRWindowLength", 0L);
            this.k = K31.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.h), "TimeScale");
        } catch (NumberFormatException e) {
            throw C5643lA0.b(null, e);
        }
    }
}
