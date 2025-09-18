package p000;

import android.util.Pair;
import java.io.IOException;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class K31 {

    /* renamed from: a */
    public final String f5889a;

    /* renamed from: b */
    public final String f5890b;

    /* renamed from: c */
    public final K31 f5891c;

    /* renamed from: d */
    public final LinkedList f5892d = new LinkedList();

    public K31(K31 k31, String str, String str2) {
        this.f5891c = k31;
        this.f5889a = str;
        this.f5890b = str2;
    }

    /* renamed from: g */
    public static int m4541g(XmlPullParser xmlPullParser, String str) throws C10103lA0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }

    /* renamed from: h */
    public static long m4542h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }

    /* renamed from: i */
    public static int m4543i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new L31(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }

    /* renamed from: b */
    public abstract Object mo4545b();

    /* renamed from: c */
    public final Object m4546c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.f5892d;
            if (i >= linkedList.size()) {
                K31 k31 = this.f5891c;
                if (k31 == null) {
                    return null;
                }
                return k31.m4546c(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    /* renamed from: d */
    public boolean mo4547d(String str) {
        return false;
    }

    /* renamed from: e */
    public final Object m4548e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            K31 p31 = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f5890b.equals(name)) {
                    mo4550j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (mo4547d(name)) {
                        mo4550j(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = this.f5889a;
                        if (zEquals) {
                            p31 = new N31(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            p31 = new M31(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            p31 = new P31(this, str);
                        }
                        if (p31 == null) {
                            i = 1;
                        } else {
                            mo4544a(p31.m4548e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    mo4551k(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                mo4549f(xmlPullParser);
                if (!mo4547d(name2)) {
                    return mo4545b();
                }
            }
            xmlPullParser.next();
        }
    }

    /* renamed from: j */
    public abstract void mo4550j(XmlPullParser xmlPullParser);

    /* renamed from: l */
    public final void m4552l(Object obj, String str) {
        this.f5892d.add(Pair.create(str, obj));
    }

    /* renamed from: a */
    public void mo4544a(Object obj) {
    }

    /* renamed from: f */
    public void mo4549f(XmlPullParser xmlPullParser) {
    }

    /* renamed from: k */
    public void mo4551k(XmlPullParser xmlPullParser) {
    }
}
