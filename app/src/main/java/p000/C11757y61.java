package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: y61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11757y61 extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f46090e;

    /* renamed from: f */
    public static final Class[] f46091f;

    /* renamed from: a */
    public final Object[] f46092a;

    /* renamed from: b */
    public final Object[] f46093b;

    /* renamed from: c */
    public final Context f46094c;

    /* renamed from: d */
    public Object f46095d;

    static {
        Class[] clsArr = {Context.class};
        f46090e = clsArr;
        f46091f = clsArr;
    }

    public C11757y61(Context context) {
        super(context);
        this.f46094c = context;
        Object[] objArr = {context};
        this.f46092a = objArr;
        this.f46093b = objArr;
    }

    /* renamed from: a */
    public static Object m26048a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m26048a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* renamed from: b */
    public final void m26049b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r4;
        int i;
        boolean z;
        ColorStateList colorStateList;
        int resourceId;
        C11630x61 c11630x61 = new C11630x61(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    z = r4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z = r4;
                        z3 = false;
                        str = null;
                    } else {
                        if (name2.equals(NotificationConstants.GROUP)) {
                            c11630x61.f45373b = 0;
                            c11630x61.f45374c = 0;
                            c11630x61.f45375d = 0;
                            c11630x61.f45376e = 0;
                            c11630x61.f45377f = r4;
                            c11630x61.f45378g = r4;
                        } else if (name2.equals("item")) {
                            if (!c11630x61.f45379h) {
                                ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0 = c11630x61.f45397z;
                                if (actionProviderVisibilityListenerC7918Lq0 == null || !actionProviderVisibilityListenerC7918Lq0.f6895b.hasSubMenu()) {
                                    c11630x61.f45379h = r4;
                                    c11630x61.m25761b(c11630x61.f45372a.add(c11630x61.f45373b, c11630x61.f45380i, c11630x61.f45381j, c11630x61.f45382k));
                                } else {
                                    c11630x61.f45379h = r4;
                                    c11630x61.m25761b(c11630x61.f45372a.addSubMenu(c11630x61.f45373b, c11630x61.f45380i, c11630x61.f45381j, c11630x61.f45382k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = r4;
                            z2 = z;
                        }
                        z = r4;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = z;
                i = 2;
                z3 = z3;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals(NotificationConstants.GROUP);
                    C11757y61 c11757y61 = c11630x61.f45371E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c11757y61.f46094c.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15438p);
                        c11630x61.f45373b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c11630x61.f45374c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c11630x61.f45375d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c11630x61.f45376e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c11630x61.f45377f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c11630x61.f45378g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c11757y61.f46094c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15439q);
                            c11630x61.f45380i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c11630x61.f45381j = (typedArrayObtainStyledAttributes2.getInt(5, c11630x61.f45374c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c11630x61.f45375d) & 65535);
                            c11630x61.f45382k = typedArrayObtainStyledAttributes2.getText(7);
                            c11630x61.f45383l = typedArrayObtainStyledAttributes2.getText(8);
                            c11630x61.f45384m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c11630x61.f45385n = string == null ? (char) 0 : string.charAt(0);
                            c11630x61.f45386o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c11630x61.f45387p = string2 == null ? (char) 0 : string2.charAt(0);
                            c11630x61.f45388q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c11630x61.f45389r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c11630x61.f45389r = c11630x61.f45376e;
                            }
                            c11630x61.f45390s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c11630x61.f45391t = typedArrayObtainStyledAttributes2.getBoolean(4, c11630x61.f45377f);
                            c11630x61.f45392u = typedArrayObtainStyledAttributes2.getBoolean(1, c11630x61.f45378g);
                            c11630x61.f45393v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c11630x61.f45396y = typedArrayObtainStyledAttributes2.getString(12);
                            c11630x61.f45394w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c11630x61.f45395x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            if (string3 != null && c11630x61.f45394w == 0 && c11630x61.f45395x == null) {
                                c11630x61.f45397z = (ActionProviderVisibilityListenerC7918Lq0) c11630x61.m25760a(string3, f46091f, c11757y61.f46093b);
                            } else {
                                c11630x61.f45397z = null;
                            }
                            c11630x61.f45367A = typedArrayObtainStyledAttributes2.getText(17);
                            c11630x61.f45368B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c11630x61.f45370D = AbstractC6737rL.m24317c(typedArrayObtainStyledAttributes2.getInt(19, -1), c11630x61.f45370D);
                            } else {
                                c11630x61.f45370D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC3982eJ.m17900b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c11630x61.f45369C = colorStateList;
                            } else {
                                c11630x61.f45369C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c11630x61.f45379h = false;
                            z = true;
                        } else if (name3.equals("menu")) {
                            z = true;
                            c11630x61.f45379h = true;
                            SubMenu subMenuAddSubMenu = c11630x61.f45372a.addSubMenu(c11630x61.f45373b, c11630x61.f45380i, c11630x61.f45381j, c11630x61.f45382k);
                            c11630x61.m25761b(subMenuAddSubMenu.getItem());
                            m26049b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            z = true;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z;
                        i = 2;
                        z3 = z3;
                    }
                }
                z = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z;
            i = 2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC7450Cq0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f46094c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC7450Cq0) {
                    MenuC7450Cq0 menuC7450Cq0 = (MenuC7450Cq0) menu;
                    if (!menuC7450Cq0.f1717p) {
                        menuC7450Cq0.m1424w();
                        z = true;
                    }
                }
                m26049b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC7450Cq0) menu).m1423v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC7450Cq0) menu).m1423v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
