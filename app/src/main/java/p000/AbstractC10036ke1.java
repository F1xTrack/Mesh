package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function2;

/* renamed from: ke1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10036ke1 {

    /* renamed from: a */
    public static final String[] f36590a = new String[0];

    /* renamed from: a */
    public static Collection m22226a(Collection collection) {
        if ((collection instanceof InterfaceC11315ue0) && !(collection instanceof InterfaceC11570we0)) {
            m22236k(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e) {
            O90.m5975m(e, AbstractC10036ke1.class.getName());
            throw e;
        }
    }

    /* renamed from: b */
    public static Map m22227b(Map map) {
        if ((map instanceof InterfaceC11315ue0) && !(map instanceof InterfaceC11697xe0)) {
            m22236k(map, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return map;
        } catch (ClassCastException e) {
            O90.m5975m(e, AbstractC10036ke1.class.getName());
            throw e;
        }
    }

    /* renamed from: c */
    public static Set m22228c(Object obj) {
        if ((obj instanceof InterfaceC11315ue0) && !(obj instanceof InterfaceC7738Ie0)) {
            m22236k(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            O90.m5975m(e, AbstractC10036ke1.class.getName());
            throw e;
        }
    }

    /* renamed from: d */
    public static void m22229d(int i, Object obj) {
        if (obj == null || m22233h(i, obj)) {
            return;
        }
        m22236k(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: e */
    public static int m22230e(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueM22074c = AbstractC9900ja1.m22074c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM22074c.resourceId;
        return i2 != 0 ? AbstractC0691Ky.m4783a(context, i2) : typedValueM22074c.data;
    }

    /* renamed from: f */
    public static int m22231f(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM22072a = AbstractC9900ja1.m22072a(context, i);
        if (typedValueM22072a != null) {
            int i3 = typedValueM22072a.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? AbstractC0691Ky.m4783a(context, i3) : typedValueM22072a.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* renamed from: g */
    public static boolean m22232g(int i) {
        return i != 0 && AbstractC0749Lu.m5130c(i) > 0.5d;
    }

    /* renamed from: h */
    public static boolean m22233h(int i, Object obj) {
        int arity;
        if (!(obj instanceof Function)) {
            return false;
        }
        if (obj instanceof InterfaceC6957uZ) {
            arity = ((InterfaceC6957uZ) obj).getArity();
        } else if (obj instanceof InterfaceC6434mZ) {
            arity = 0;
        } else if (obj instanceof InterfaceC6497nZ) {
            arity = 1;
        } else if (obj instanceof Function2) {
            arity = 2;
        } else if (obj instanceof InterfaceC6625pZ) {
            arity = 3;
        } else if (obj instanceof InterfaceC6688qZ) {
            arity = 4;
        } else {
            boolean z = obj instanceof InterfaceC0854NZ;
            arity = z ? 5 : obj instanceof InterfaceC6751rZ ? 6 : z ? 7 : obj instanceof InterfaceC6831sZ ? 8 : z ? 9 : z ? 10 : z ? 11 : z ? 12 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : z ? 22 : -1;
        }
        return arity == i;
    }

    /* renamed from: i */
    public static int m22234i(int i, float f, int i2) {
        return AbstractC0749Lu.m5131d(AbstractC0749Lu.m5133f(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* renamed from: j */
    public static void m22235j(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: k */
    public static void m22236k(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC1374Vq.m8589h(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        O90.m5975m(classCastException, AbstractC10036ke1.class.getName());
        throw classCastException;
    }
}
