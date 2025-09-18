package p000;

import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class O31 extends K31 {

    /* renamed from: e */
    public final LinkedList f8200e;

    /* renamed from: f */
    public int f8201f;

    /* renamed from: g */
    public int f8202g;

    /* renamed from: h */
    public long f8203h;

    /* renamed from: i */
    public long f8204i;

    /* renamed from: j */
    public long f8205j;

    /* renamed from: k */
    public int f8206k;

    /* renamed from: l */
    public boolean f8207l;

    /* renamed from: m */
    public H31 f8208m;

    public O31(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f8206k = -1;
        this.f8208m = null;
        this.f8200e = new LinkedList();
    }

    @Override // p000.K31
    /* renamed from: a */
    public final void mo4544a(Object obj) {
        if (obj instanceof I31) {
            this.f8200e.add((I31) obj);
        } else if (obj instanceof H31) {
            YN1.m9281f(this.f8208m == null);
            this.f8208m = (H31) obj;
        }
    }

    @Override // p000.K31
    /* renamed from: b */
    public final Object mo4545b() {
        boolean z;
        H31 h31;
        int i;
        long jM1810Y;
        long jM1810Y2;
        LinkedList linkedList = this.f8200e;
        int size = linkedList.size();
        I31[] i31Arr = new I31[size];
        linkedList.toArray(i31Arr);
        H31 h312 = this.f8208m;
        if (h312 != null) {
            C0589JL c0589jl = new C0589JL(new C0526IL(h312.f4032a, null, "video/mp4", h312.f4033b));
            for (int i2 = 0; i2 < size; i2++) {
                I31 i31 = i31Arr[i2];
                int i3 = i31.f4674a;
                if (i3 == 2 || i3 == 1) {
                    int i4 = 0;
                    while (true) {
                        C6686qX[] c6686qXArr = i31.f4683j;
                        if (i4 < c6686qXArr.length) {
                            C6623pX c6623pXM24020a = c6686qXArr[i4].m24020a();
                            c6623pXM24020a.f40165p = c0589jl;
                            c6686qXArr[i4] = new C6686qX(c6623pXM24020a);
                            i4++;
                        }
                    }
                }
            }
        }
        int i5 = this.f8201f;
        int i6 = this.f8202g;
        long j = this.f8203h;
        long j2 = this.f8204i;
        long j3 = this.f8205j;
        int i7 = this.f8206k;
        boolean z2 = this.f8207l;
        H31 h313 = this.f8208m;
        if (j2 == 0) {
            z = z2;
            h31 = h313;
            i = i7;
            jM1810Y = -9223372036854775807L;
        } else {
            int i8 = AbstractC7485Dh1.f2166a;
            z = z2;
            h31 = h313;
            i = i7;
            jM1810Y = AbstractC7485Dh1.m1810Y(j2, 1000000L, j, RoundingMode.FLOOR);
        }
        if (j3 == 0) {
            jM1810Y2 = -9223372036854775807L;
        } else {
            int i9 = AbstractC7485Dh1.f2166a;
            jM1810Y2 = AbstractC7485Dh1.m1810Y(j3, 1000000L, j, RoundingMode.FLOOR);
        }
        return new J31(i5, i6, jM1810Y, jM1810Y2, i, z, h31, i31Arr);
    }

    @Override // p000.K31
    /* renamed from: j */
    public final void mo4550j(XmlPullParser xmlPullParser) throws C10103lA0 {
        this.f8201f = K31.m4543i(xmlPullParser, "MajorVersion");
        this.f8202g = K31.m4543i(xmlPullParser, "MinorVersion");
        this.f8203h = K31.m4542h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new L31("Duration", 0);
        }
        try {
            this.f8204i = Long.parseLong(attributeValue);
            this.f8205j = K31.m4542h(xmlPullParser, "DVRWindowLength", 0L);
            this.f8206k = K31.m4541g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f8207l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            m4552l(Long.valueOf(this.f8203h), "TimeScale");
        } catch (NumberFormatException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }
}
