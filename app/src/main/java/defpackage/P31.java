package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class P31 extends K31 {
    public final String e;
    public final LinkedList f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList q;
    public long r;

    public P31(K31 k31, String str) {
        super(k31, str, "StreamIndex");
        this.e = str;
        this.f = new LinkedList();
    }

    @Override // defpackage.K31
    public final void a(Object obj) {
        if (obj instanceof C6666qX) {
            this.f.add((C6666qX) obj);
        }
    }

    @Override // defpackage.K31
    public final Object b() {
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
        LinkedList linkedList = this.f;
        C6666qX[] c6666qXArr = new C6666qX[linkedList.size()];
        linkedList.toArray(c6666qXArr);
        String str = this.k;
        int i6 = this.g;
        String str2 = this.h;
        long j = this.i;
        String str3 = this.j;
        int i7 = this.l;
        int i8 = this.m;
        int i9 = this.n;
        int i10 = this.o;
        String str4 = this.p;
        ArrayList arrayList4 = this.q;
        long j2 = this.r;
        int i11 = AbstractC0277Dh1.a;
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
                                jArr[i5] = AbstractC0277Dh1.Z(jLongValue, 1000000L, j, roundingMode);
                            } else {
                                jArr3[i12] = AbstractC0300Dp0.f(1000000L, AbstractC0300Dp0.d(jLongValue, j, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i12] = AbstractC0300Dp0.d(1000000L, AbstractC0300Dp0.d(j, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
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
                long jD = AbstractC0300Dp0.d(1000000L, j, RoundingMode.UNNECESSARY);
                for (int i13 = 0; i13 < size; i13++) {
                    jArr3[i13] = AbstractC0300Dp0.f(((Long) arrayList4.get(i13)).longValue(), jD);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i = i8;
            long jD2 = AbstractC0300Dp0.d(j, 1000000L, RoundingMode.UNNECESSARY);
            int i14 = 0;
            while (i14 < size) {
                jArr3[i14] = AbstractC0300Dp0.d(((Long) arrayList4.get(i14)).longValue(), jD2, roundingMode2);
                i14++;
                i7 = i7;
                i9 = i9;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i2 = i9;
            i3 = i7;
        }
        return new I31(this.e, str, i6, str2, j, str3, i3, i, i2, i10, str4, c6666qXArr, arrayList3, jArr2, AbstractC0277Dh1.Y(j2, 1000000L, j, RoundingMode.FLOOR));
    }

    @Override // defpackage.K31
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // defpackage.K31
    public final void j(XmlPullParser xmlPullParser) throws C5643lA0 {
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
                        throw C5643lA0.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i = 3;
                }
            }
            this.g = i;
            l(Integer.valueOf(i), "Type");
            if (this.g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new L31("Subtype", 0);
                }
                this.h = attributeValue2;
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new L31("Url", 0);
            }
            this.k = attributeValue4;
            this.l = K31.g(xmlPullParser, "MaxWidth");
            this.m = K31.g(xmlPullParser, "MaxHeight");
            this.n = K31.g(xmlPullParser, "DisplayWidth");
            this.o = K31.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue5;
            l(attributeValue5, "Language");
            long jG = K31.g(xmlPullParser, "TimeScale");
            this.i = jG;
            if (jG == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList();
            return;
        }
        int size = this.q.size();
        long jH = K31.h(xmlPullParser, "t", -9223372036854775807L);
        if (jH == -9223372036854775807L) {
            if (size == 0) {
                jH = 0;
            } else {
                if (this.r == -1) {
                    throw C5643lA0.b("Unable to infer start time", null);
                }
                jH = this.r + ((Long) this.q.get(size - 1)).longValue();
            }
        }
        this.q.add(Long.valueOf(jH));
        this.r = K31.h(xmlPullParser, UcumUtils.UCUM_DAYS, -9223372036854775807L);
        long jH2 = K31.h(xmlPullParser, "r", 1L);
        if (jH2 > 1 && this.r == -9223372036854775807L) {
            throw C5643lA0.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i;
            if (j >= jH2) {
                return;
            }
            this.q.add(Long.valueOf((this.r * j) + jH));
            i++;
        }
    }
}
