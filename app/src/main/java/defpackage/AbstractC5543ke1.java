package defpackage;

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
public abstract class AbstractC5543ke1 {
    public static final String[] a = new String[0];

    public static Collection a(Collection collection) {
        if ((collection instanceof InterfaceC7451ue0) && !(collection instanceof InterfaceC7832we0)) {
            k(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e) {
            O90.m(e, AbstractC5543ke1.class.getName());
            throw e;
        }
    }

    public static Map b(Map map) {
        if ((map instanceof InterfaceC7451ue0) && !(map instanceof InterfaceC8022xe0)) {
            k(map, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return map;
        } catch (ClassCastException e) {
            O90.m(e, AbstractC5543ke1.class.getName());
            throw e;
        }
    }

    public static Set c(Object obj) {
        if ((obj instanceof InterfaceC7451ue0) && !(obj instanceof InterfaceC0657Ie0)) {
            k(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            O90.m(e, AbstractC5543ke1.class.getName());
            throw e;
        }
    }

    public static void d(int i, Object obj) {
        if (obj == null || h(i, obj)) {
            return;
        }
        k(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static int e(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueC = AbstractC5340ja1.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueC.resourceId;
        return i2 != 0 ? AbstractC0872Ky.a(context, i2) : typedValueC.data;
    }

    public static int f(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueA = AbstractC5340ja1.a(context, i);
        if (typedValueA != null) {
            int i3 = typedValueA.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? AbstractC0872Ky.a(context, i3) : typedValueA.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static boolean g(int i) {
        return i != 0 && AbstractC0937Lu.c(i) > 0.5d;
    }

    public static boolean h(int i, Object obj) {
        int arity;
        if (!(obj instanceof Function)) {
            return false;
        }
        if (obj instanceof InterfaceC7435uZ) {
            arity = ((InterfaceC7435uZ) obj).getArity();
        } else if (obj instanceof InterfaceC5908mZ) {
            arity = 0;
        } else if (obj instanceof InterfaceC6099nZ) {
            arity = 1;
        } else if (obj instanceof Function2) {
            arity = 2;
        } else if (obj instanceof InterfaceC6481pZ) {
            arity = 3;
        } else if (obj instanceof InterfaceC6672qZ) {
            arity = 4;
        } else {
            boolean z = obj instanceof NZ;
            arity = z ? 5 : obj instanceof InterfaceC6862rZ ? 6 : z ? 7 : obj instanceof InterfaceC7053sZ ? 8 : z ? 9 : z ? 10 : z ? 11 : z ? 12 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : z ? 22 : -1;
        }
        return arity == i;
    }

    public static int i(int i, float f, int i2) {
        return AbstractC0937Lu.d(AbstractC0937Lu.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static void j(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void k(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC1705Vq.h(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        O90.m(classCastException, AbstractC5543ke1.class.getName());
        throw classCastException;
    }
}
