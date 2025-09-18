package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class K31 {
    public final String a;
    public final String b;
    public final K31 c;
    public final LinkedList d = new LinkedList();

    public K31(K31 k31, String str, String str2) {
        this.c = k31;
        this.a = str;
        this.b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) throws C5643lA0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw C5643lA0.b(null, e);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw C5643lA0.b(null, e);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new L31(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw C5643lA0.b(null, e);
        }
    }

    public abstract Object b();

    public final Object c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.d;
            if (i >= linkedList.size()) {
                K31 k31 = this.c;
                if (k31 == null) {
                    return null;
                }
                return k31.c(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
                if (this.b.equals(name)) {
                    j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = this.a;
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
                            a(p31.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    k(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
