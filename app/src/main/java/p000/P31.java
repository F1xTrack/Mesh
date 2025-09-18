package p000;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class P31 extends K31 {

    /* renamed from: e */
    public final String f8817e;

    /* renamed from: f */
    public final LinkedList f8818f;

    /* renamed from: g */
    public int f8819g;

    /* renamed from: h */
    public String f8820h;

    /* renamed from: i */
    public long f8821i;

    /* renamed from: j */
    public String f8822j;

    /* renamed from: k */
    public String f8823k;

    /* renamed from: l */
    public int f8824l;

    /* renamed from: m */
    public int f8825m;

    /* renamed from: n */
    public int f8826n;

    /* renamed from: o */
    public int f8827o;

    /* renamed from: p */
    public String f8828p;

    /* renamed from: q */
    public ArrayList f8829q;

    /* renamed from: r */
    public long f8830r;

    public P31(K31 k31, String str) {
        super(k31, str, "StreamIndex");
        this.f8817e = str;
        this.f8818f = new LinkedList();
    }

    @Override // p000.K31
    /* renamed from: a */
    public final void mo4544a(Object obj) {
        if (obj instanceof C6686qX) {
            this.f8818f.add((C6686qX) obj);
        }
    }

    @Override // p000.K31
    /* renamed from: b */
    public final Object mo4545b() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i4;
        long[] jArr;
        int i5;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f8818f;
        C6686qX[] c6686qXArr = new C6686qX[linkedList.size()];
        linkedList.toArray(c6686qXArr);
        String str = this.f8823k;
        int i6 = this.f8819g;
        String str2 = this.f8820h;
        long j = this.f8821i;
        String str3 = this.f8822j;
        int i7 = this.f8824l;
        int i8 = this.f8825m;
        int i9 = this.f8826n;
        int i10 = this.f8827o;
        String str4 = this.f8828p;
        ArrayList arrayList4 = this.f8829q;
        long j2 = this.f8830r;
        int i11 = AbstractC7485Dh1.f2166a;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        if (j < 1000000 || j % 1000000 != 0) {
            i = i8;
            i2 = i9;
            i3 = i7;
            if (j >= 1000000 || 1000000 % j != 0) {
                int i12 = 0;
                while (i12 < size) {
                    long jLongValue = ((Long) arrayList4.get(i12)).longValue();
                    if (jLongValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i4 = size;
                        jArr = jArr3;
                        i5 = i12;
                    } else {
                        if (j < jLongValue || j % jLongValue != 0) {
                            arrayList = arrayList4;
                            if (j >= jLongValue || jLongValue % j != 0) {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i4 = size;
                                jArr = jArr3;
                                i5 = i12;
                                jArr[i5] = AbstractC7485Dh1.m1811Z(jLongValue, 1000000L, j, roundingMode);
                            } else {
                                jArr3[i12] = AbstractC7500Dp0.m1905f(1000000L, AbstractC7500Dp0.m1903d(jLongValue, j, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i12] = AbstractC7500Dp0.m1903d(1000000L, AbstractC7500Dp0.m1903d(j, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        }
                        i4 = size;
                        jArr = jArr3;
                        i5 = i12;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i12 = i5 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i4;
                    jArr3 = jArr;
                }
            } else {
                long jM1903d = AbstractC7500Dp0.m1903d(1000000L, j, RoundingMode.UNNECESSARY);
                for (int i13 = 0; i13 < size; i13++) {
                    jArr3[i13] = AbstractC7500Dp0.m1905f(((Long) arrayList4.get(i13)).longValue(), jM1903d);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i = i8;
            long jM1903d2 = AbstractC7500Dp0.m1903d(j, 1000000L, RoundingMode.UNNECESSARY);
            int i14 = 0;
            while (i14 < size) {
                jArr3[i14] = AbstractC7500Dp0.m1903d(((Long) arrayList4.get(i14)).longValue(), jM1903d2, roundingMode2);
                i14++;
                i7 = i7;
                i9 = i9;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i2 = i9;
            i3 = i7;
        }
        return new I31(this.f8817e, str, i6, str2, j, str3, i3, i, i2, i10, str4, c6686qXArr, arrayList3, jArr2, AbstractC7485Dh1.m1810Y(j2, 1000000L, j, RoundingMode.FLOOR));
    }

    @Override // p000.K31
    /* renamed from: d */
    public final boolean mo4547d(String str) {
        return "c".equals(str);
    }

    @Override // p000.K31
    /* renamed from: j */
    public final void mo4550j(XmlPullParser xmlPullParser) throws C10103lA0 {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new L31("Type", 0);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw C10103lA0.m22367b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i = 3;
                }
            }
            this.f8819g = i;
            m4552l(Integer.valueOf(i), "Type");
            if (this.f8819g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new L31("Subtype", 0);
                }
                this.f8820h = attributeValue2;
            } else {
                this.f8820h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m4552l(this.f8820h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f8822j = attributeValue3;
            m4552l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new L31("Url", 0);
            }
            this.f8823k = attributeValue4;
            this.f8824l = K31.m4541g(xmlPullParser, "MaxWidth");
            this.f8825m = K31.m4541g(xmlPullParser, "MaxHeight");
            this.f8826n = K31.m4541g(xmlPullParser, "DisplayWidth");
            this.f8827o = K31.m4541g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f8828p = attributeValue5;
            m4552l(attributeValue5, "Language");
            long jM4541g = K31.m4541g(xmlPullParser, "TimeScale");
            this.f8821i = jM4541g;
            if (jM4541g == -1) {
                this.f8821i = ((Long) m4546c("TimeScale")).longValue();
            }
            this.f8829q = new ArrayList();
            return;
        }
        int size = this.f8829q.size();
        long jM4542h = K31.m4542h(xmlPullParser, "t", -9223372036854775807L);
        if (jM4542h == -9223372036854775807L) {
            if (size == 0) {
                jM4542h = 0;
            } else {
                if (this.f8830r == -1) {
                    throw C10103lA0.m22367b("Unable to infer start time", null);
                }
                jM4542h = this.f8830r + ((Long) this.f8829q.get(size - 1)).longValue();
            }
        }
        this.f8829q.add(Long.valueOf(jM4542h));
        this.f8830r = K31.m4542h(xmlPullParser, UcumUtils.UCUM_DAYS, -9223372036854775807L);
        long jM4542h2 = K31.m4542h(xmlPullParser, "r", 1L);
        if (jM4542h2 > 1 && this.f8830r == -9223372036854775807L) {
            throw C10103lA0.m22367b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i;
            if (j >= jM4542h2) {
                return;
            }
            this.f8829q.add(Long.valueOf((this.f8830r * j) + jM4542h));
            i++;
        }
    }
}
