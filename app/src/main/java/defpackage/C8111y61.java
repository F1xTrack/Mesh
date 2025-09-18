package defpackage;

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
public final class C8111y61 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public C8111y61(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r4;
        int i;
        boolean z;
        ColorStateList colorStateList;
        int resourceId;
        C7921x61 c7921x61 = new C7921x61(this, menu);
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
                            c7921x61.b = 0;
                            c7921x61.c = 0;
                            c7921x61.d = 0;
                            c7921x61.e = 0;
                            c7921x61.f = r4;
                            c7921x61.g = r4;
                        } else if (name2.equals("item")) {
                            if (!c7921x61.h) {
                                ActionProviderVisibilityListenerC0927Lq0 actionProviderVisibilityListenerC0927Lq0 = c7921x61.z;
                                if (actionProviderVisibilityListenerC0927Lq0 == null || !actionProviderVisibilityListenerC0927Lq0.b.hasSubMenu()) {
                                    c7921x61.h = r4;
                                    c7921x61.b(c7921x61.a.add(c7921x61.b, c7921x61.i, c7921x61.j, c7921x61.k));
                                } else {
                                    c7921x61.h = r4;
                                    c7921x61.b(c7921x61.a.addSubMenu(c7921x61.b, c7921x61.i, c7921x61.j, c7921x61.k).getItem());
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
                    C8111y61 c8111y61 = c7921x61.E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c8111y61.c.obtainStyledAttributes(attributeSet, AbstractC2104aH0.p);
                        c7921x61.b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c7921x61.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c7921x61.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c7921x61.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c7921x61.f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c7921x61.g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c8111y61.c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2104aH0.q);
                            c7921x61.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c7921x61.j = (typedArrayObtainStyledAttributes2.getInt(5, c7921x61.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c7921x61.d) & 65535);
                            c7921x61.k = typedArrayObtainStyledAttributes2.getText(7);
                            c7921x61.l = typedArrayObtainStyledAttributes2.getText(8);
                            c7921x61.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c7921x61.n = string == null ? (char) 0 : string.charAt(0);
                            c7921x61.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c7921x61.p = string2 == null ? (char) 0 : string2.charAt(0);
                            c7921x61.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c7921x61.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c7921x61.r = c7921x61.e;
                            }
                            c7921x61.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c7921x61.t = typedArrayObtainStyledAttributes2.getBoolean(4, c7921x61.f);
                            c7921x61.u = typedArrayObtainStyledAttributes2.getBoolean(1, c7921x61.g);
                            c7921x61.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c7921x61.y = typedArrayObtainStyledAttributes2.getString(12);
                            c7921x61.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c7921x61.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            if (string3 != null && c7921x61.w == 0 && c7921x61.x == null) {
                                c7921x61.z = (ActionProviderVisibilityListenerC0927Lq0) c7921x61.a(string3, f, c8111y61.b);
                            } else {
                                c7921x61.z = null;
                            }
                            c7921x61.A = typedArrayObtainStyledAttributes2.getText(17);
                            c7921x61.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c7921x61.D = AbstractC6820rL.c(typedArrayObtainStyledAttributes2.getInt(19, -1), c7921x61.D);
                            } else {
                                c7921x61.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC3556eJ.b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c7921x61.C = colorStateList;
                            } else {
                                c7921x61.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c7921x61.h = false;
                            z = true;
                        } else if (name3.equals("menu")) {
                            z = true;
                            c7921x61.h = true;
                            SubMenu subMenuAddSubMenu = c7921x61.a.addSubMenu(c7921x61.b, c7921x61.i, c7921x61.j, c7921x61.k);
                            c7921x61.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
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
        if (!(menu instanceof MenuC0225Cq0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC0225Cq0) {
                    MenuC0225Cq0 menuC0225Cq0 = (MenuC0225Cq0) menu;
                    if (!menuC0225Cq0.p) {
                        menuC0225Cq0.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC0225Cq0) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC0225Cq0) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
