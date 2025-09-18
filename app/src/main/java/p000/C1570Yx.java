package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.p019vk.push.core.base.AidlException;
import com.swmansion.reanimated.BuildConfig;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Yx */
/* loaded from: classes.dex */
public final class C1570Yx {

    /* renamed from: d */
    public static final int[] f14621d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f14622e;

    /* renamed from: a */
    public final HashMap f14623a = new HashMap();

    /* renamed from: b */
    public final boolean f14624b = true;

    /* renamed from: c */
    public final HashMap f14625c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14622e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(AidlException.ILLEGAL_ARGUMENT_EXCEPTION, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(AidlException.HOST_IS_NOT_MASTER, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    /* renamed from: c */
    public static int[] m9430c(C0546If c0546If, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        Context context = c0546If.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = IG0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, NotificationConstants.f19487ID, context.getPackageName());
            }
            if (iIntValue == 0 && c0546If.isInEditMode() && (c0546If.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0546If.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f16063m) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f16063m.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: d */
    public static C1255Tx m9431d(Context context, AttributeSet attributeSet) {
        C1255Tx c1255Tx = new C1255Tx();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.f11272a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C1444Wx c1444Wx = c1255Tx.f11600b;
            C1381Vx c1381Vx = c1255Tx.f11601c;
            C1507Xx c1507Xx = c1255Tx.f11603e;
            C1318Ux c1318Ux = c1255Tx.f11602d;
            if (index != 1 && 23 != index && 24 != index) {
                c1381Vx.getClass();
                c1318Ux.getClass();
                c1507Xx.getClass();
            }
            SparseIntArray sparseIntArray = f14622e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1318Ux.f12256o = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12256o);
                    break;
                case 2:
                    c1318Ux.f12212F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12212F);
                    break;
                case 3:
                    c1318Ux.f12255n = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12255n);
                    break;
                case 4:
                    c1318Ux.f12254m = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12254m);
                    break;
                case 5:
                    c1318Ux.f12263v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c1318Ux.f12267z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1318Ux.f12267z);
                    break;
                case 7:
                    c1318Ux.f12207A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1318Ux.f12207A);
                    break;
                case 8:
                    c1318Ux.f12213G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12213G);
                    break;
                case 9:
                    c1318Ux.f12260s = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12260s);
                    break;
                case 10:
                    c1318Ux.f12259r = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12259r);
                    break;
                case 11:
                    c1318Ux.f12218L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12218L);
                    break;
                case 12:
                    c1318Ux.f12219M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12219M);
                    break;
                case 13:
                    c1318Ux.f12215I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12215I);
                    break;
                case 14:
                    c1318Ux.f12217K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12217K);
                    break;
                case 15:
                    c1318Ux.f12220N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12220N);
                    break;
                case 16:
                    c1318Ux.f12216J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12216J);
                    break;
                case 17:
                    c1318Ux.f12239d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1318Ux.f12239d);
                    break;
                case 18:
                    c1318Ux.f12241e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1318Ux.f12241e);
                    break;
                case 19:
                    c1318Ux.f12243f = typedArrayObtainStyledAttributes.getFloat(index, c1318Ux.f12243f);
                    break;
                case 20:
                    c1318Ux.f12261t = typedArrayObtainStyledAttributes.getFloat(index, c1318Ux.f12261t);
                    break;
                case 21:
                    c1318Ux.f12237c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1318Ux.f12237c);
                    break;
                case 22:
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, c1444Wx.f13461a);
                    c1444Wx.f13461a = i2;
                    c1444Wx.f13461a = f14621d[i2];
                    break;
                case 23:
                    c1318Ux.f12235b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1318Ux.f12235b);
                    break;
                case 24:
                    c1318Ux.f12209C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12209C);
                    break;
                case 25:
                    c1318Ux.f12245g = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12245g);
                    break;
                case 26:
                    c1318Ux.f12247h = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12247h);
                    break;
                case 27:
                    c1318Ux.f12208B = typedArrayObtainStyledAttributes.getInt(index, c1318Ux.f12208B);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    c1318Ux.f12210D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12210D);
                    break;
                case 29:
                    c1318Ux.f12249i = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12249i);
                    break;
                case 30:
                    c1318Ux.f12251j = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12251j);
                    break;
                case 31:
                    c1318Ux.f12214H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12214H);
                    break;
                case 32:
                    c1318Ux.f12257p = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12257p);
                    break;
                case 33:
                    c1318Ux.f12258q = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12258q);
                    break;
                case 34:
                    c1318Ux.f12211E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12211E);
                    break;
                case C5043c9.f31374J /* 35 */:
                    c1318Ux.f12253l = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12253l);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    c1318Ux.f12252k = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12252k);
                    break;
                case 37:
                    c1318Ux.f12262u = typedArrayObtainStyledAttributes.getFloat(index, c1318Ux.f12262u);
                    break;
                case C5043c9.f31375K /* 38 */:
                    c1255Tx.f11599a = typedArrayObtainStyledAttributes.getResourceId(index, c1255Tx.f11599a);
                    break;
                case 39:
                    c1318Ux.f12222P = typedArrayObtainStyledAttributes.getFloat(index, c1318Ux.f12222P);
                    break;
                case C5043c9.f31376L /* 40 */:
                    c1318Ux.f12221O = typedArrayObtainStyledAttributes.getFloat(index, c1318Ux.f12221O);
                    break;
                case 41:
                    c1318Ux.f12223Q = typedArrayObtainStyledAttributes.getInt(index, c1318Ux.f12223Q);
                    break;
                case C5043c9.f31377M /* 42 */:
                    c1318Ux.f12224R = typedArrayObtainStyledAttributes.getInt(index, c1318Ux.f12224R);
                    break;
                case 43:
                    c1444Wx.f13463c = typedArrayObtainStyledAttributes.getFloat(index, c1444Wx.f13463c);
                    break;
                case 44:
                    c1507Xx.f14063k = true;
                    c1507Xx.f14064l = typedArrayObtainStyledAttributes.getDimension(index, c1507Xx.f14064l);
                    break;
                case 45:
                    c1507Xx.f14054b = typedArrayObtainStyledAttributes.getFloat(index, c1507Xx.f14054b);
                    break;
                case 46:
                    c1507Xx.f14055c = typedArrayObtainStyledAttributes.getFloat(index, c1507Xx.f14055c);
                    break;
                case 47:
                    c1507Xx.f14056d = typedArrayObtainStyledAttributes.getFloat(index, c1507Xx.f14056d);
                    break;
                case 48:
                    c1507Xx.f14057e = typedArrayObtainStyledAttributes.getFloat(index, c1507Xx.f14057e);
                    break;
                case 49:
                    c1507Xx.f14058f = typedArrayObtainStyledAttributes.getDimension(index, c1507Xx.f14058f);
                    break;
                case 50:
                    c1507Xx.f14059g = typedArrayObtainStyledAttributes.getDimension(index, c1507Xx.f14059g);
                    break;
                case 51:
                    c1507Xx.f14060h = typedArrayObtainStyledAttributes.getDimension(index, c1507Xx.f14060h);
                    break;
                case 52:
                    c1507Xx.f14061i = typedArrayObtainStyledAttributes.getDimension(index, c1507Xx.f14061i);
                    break;
                case 53:
                    c1507Xx.f14062j = typedArrayObtainStyledAttributes.getDimension(index, c1507Xx.f14062j);
                    break;
                case 54:
                    c1318Ux.f12225S = typedArrayObtainStyledAttributes.getInt(index, c1318Ux.f12225S);
                    break;
                case 55:
                    c1318Ux.f12226T = typedArrayObtainStyledAttributes.getInt(index, c1318Ux.f12226T);
                    break;
                case 56:
                    c1318Ux.f12227U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12227U);
                    break;
                case 57:
                    c1318Ux.f12228V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12228V);
                    break;
                case 58:
                    c1318Ux.f12229W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12229W);
                    break;
                case 59:
                    c1318Ux.f12230X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12230X);
                    break;
                case 60:
                    c1507Xx.f14053a = typedArrayObtainStyledAttributes.getFloat(index, c1507Xx.f14053a);
                    break;
                case 61:
                    c1318Ux.f12264w = m9432f(typedArrayObtainStyledAttributes, index, c1318Ux.f12264w);
                    break;
                case 62:
                    c1318Ux.f12265x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12265x);
                    break;
                case 63:
                    c1318Ux.f12266y = typedArrayObtainStyledAttributes.getFloat(index, c1318Ux.f12266y);
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    c1381Vx.f12877a = m9432f(typedArrayObtainStyledAttributes, index, c1381Vx.f12877a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c1381Vx.getClass();
                        break;
                    } else {
                        String str = AbstractC9900ja1.f35251a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c1381Vx.getClass();
                        break;
                    }
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1381Vx.getClass();
                    break;
                case 67:
                    c1381Vx.f12880d = typedArrayObtainStyledAttributes.getFloat(index, c1381Vx.f12880d);
                    break;
                case 68:
                    c1444Wx.f13464d = typedArrayObtainStyledAttributes.getFloat(index, c1444Wx.f13464d);
                    break;
                case 69:
                    c1318Ux.f12231Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1318Ux.f12232Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c1318Ux.f12234a0 = typedArrayObtainStyledAttributes.getInt(index, c1318Ux.f12234a0);
                    break;
                case 73:
                    c1318Ux.f12236b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1318Ux.f12236b0);
                    break;
                case 74:
                    c1318Ux.f12242e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
                    c1318Ux.f12250i0 = typedArrayObtainStyledAttributes.getBoolean(index, c1318Ux.f12250i0);
                    break;
                case 76:
                    c1381Vx.f12878b = typedArrayObtainStyledAttributes.getInt(index, c1381Vx.f12878b);
                    break;
                case 77:
                    c1318Ux.f12244f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c1444Wx.f13462b = typedArrayObtainStyledAttributes.getInt(index, c1444Wx.f13462b);
                    break;
                case 79:
                    c1381Vx.f12879c = typedArrayObtainStyledAttributes.getFloat(index, c1381Vx.f12879c);
                    break;
                case 80:
                    c1318Ux.f12246g0 = typedArrayObtainStyledAttributes.getBoolean(index, c1318Ux.f12246g0);
                    break;
                case 81:
                    c1318Ux.f12248h0 = typedArrayObtainStyledAttributes.getBoolean(index, c1318Ux.f12248h0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1255Tx;
    }

    /* renamed from: f */
    public static int m9432f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    public final void m9433a(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f14625c;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.f14624b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C1255Tx c1255Tx = (C1255Tx) map.get(Integer.valueOf(id));
                    if (childAt instanceof C0546If) {
                        c1255Tx.f11602d.f12238c0 = 1;
                    }
                    int i2 = c1255Tx.f11602d.f12238c0;
                    if (i2 != -1 && i2 == 1) {
                        C0546If c0546If = (C0546If) childAt;
                        c0546If.setId(id);
                        C1318Ux c1318Ux = c1255Tx.f11602d;
                        c0546If.setType(c1318Ux.f12234a0);
                        c0546If.setMargin(c1318Ux.f12236b0);
                        c0546If.setAllowsGoneWidget(c1318Ux.f12250i0);
                        int[] iArr = c1318Ux.f12240d0;
                        if (iArr != null) {
                            c0546If.setReferencedIds(iArr);
                        } else {
                            String str = c1318Ux.f12242e0;
                            if (str != null) {
                                int[] iArrM9430c = m9430c(c0546If, str);
                                c1318Ux.f12240d0 = iArrM9430c;
                                c0546If.setReferencedIds(iArrM9430c);
                            }
                        }
                    }
                    C0941Ox c0941Ox = (C0941Ox) childAt.getLayoutParams();
                    c0941Ox.m6188a();
                    c1255Tx.m7827a(c0941Ox);
                    HashMap map2 = c1255Tx.f11604f;
                    Class<?> cls = childAt.getClass();
                    for (String str2 : map2.keySet()) {
                        C0690Kx c0690Kx = (C0690Kx) map2.get(str2);
                        String strM26245v = AbstractC7222ym.m26245v("set", str2);
                        try {
                            switch (AbstractC7222ym.m26247x(c0690Kx.f6395a)) {
                                case 0:
                                    cls.getMethod(strM26245v, Integer.TYPE).invoke(childAt, Integer.valueOf(c0690Kx.f6396b));
                                    break;
                                case 1:
                                    cls.getMethod(strM26245v, Float.TYPE).invoke(childAt, Float.valueOf(c0690Kx.f6397c));
                                    break;
                                case 2:
                                    cls.getMethod(strM26245v, Integer.TYPE).invoke(childAt, Integer.valueOf(c0690Kx.f6400f));
                                    break;
                                case 3:
                                    Method method = cls.getMethod(strM26245v, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(c0690Kx.f6400f);
                                    method.invoke(childAt, colorDrawable);
                                    break;
                                case 4:
                                    cls.getMethod(strM26245v, CharSequence.class).invoke(childAt, c0690Kx.f6398d);
                                    break;
                                case 5:
                                    cls.getMethod(strM26245v, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0690Kx.f6399e));
                                    break;
                                case 6:
                                    cls.getMethod(strM26245v, Float.TYPE).invoke(childAt, Float.valueOf(c0690Kx.f6397c));
                                    break;
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e2) {
                            e2.getMessage();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(c0941Ox);
                    C1444Wx c1444Wx = c1255Tx.f11600b;
                    if (c1444Wx.f13462b == 0) {
                        childAt.setVisibility(c1444Wx.f13461a);
                    }
                    childAt.setAlpha(c1444Wx.f13463c);
                    C1507Xx c1507Xx = c1255Tx.f11603e;
                    childAt.setRotation(c1507Xx.f14053a);
                    childAt.setRotationX(c1507Xx.f14054b);
                    childAt.setRotationY(c1507Xx.f14055c);
                    childAt.setScaleX(c1507Xx.f14056d);
                    childAt.setScaleY(c1507Xx.f14057e);
                    if (!Float.isNaN(c1507Xx.f14058f)) {
                        childAt.setPivotX(c1507Xx.f14058f);
                    }
                    if (!Float.isNaN(c1507Xx.f14059g)) {
                        childAt.setPivotY(c1507Xx.f14059g);
                    }
                    childAt.setTranslationX(c1507Xx.f14060h);
                    childAt.setTranslationY(c1507Xx.f14061i);
                    childAt.setTranslationZ(c1507Xx.f14062j);
                    if (c1507Xx.f14063k) {
                        childAt.setElevation(c1507Xx.f14064l);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1255Tx c1255Tx2 = (C1255Tx) map.get(num);
            C1318Ux c1318Ux2 = c1255Tx2.f11602d;
            int i3 = c1318Ux2.f12238c0;
            if (i3 != -1 && i3 == 1) {
                Context context = constraintLayout.getContext();
                C0546If c0546If2 = new C0546If(context);
                c0546If2.f7409a = new int[32];
                c0546If2.f7414f = new HashMap();
                c0546If2.f7411c = context;
                C0609Jf c0609Jf = new C0609Jf();
                c0609Jf.f5662f0 = 0;
                c0609Jf.f5663g0 = true;
                c0609Jf.f5664h0 = 0;
                c0546If2.f5068i = c0609Jf;
                c0546If2.f7412d = c0609Jf;
                c0546If2.m5486g();
                c0546If2.setVisibility(8);
                c0546If2.setId(num.intValue());
                int[] iArr2 = c1318Ux2.f12240d0;
                if (iArr2 != null) {
                    c0546If2.setReferencedIds(iArr2);
                } else {
                    String str3 = c1318Ux2.f12242e0;
                    if (str3 != null) {
                        int[] iArrM9430c2 = m9430c(c0546If2, str3);
                        c1318Ux2.f12240d0 = iArrM9430c2;
                        c0546If2.setReferencedIds(iArrM9430c2);
                    }
                }
                c0546If2.setType(c1318Ux2.f12234a0);
                c0546If2.setMargin(c1318Ux2.f12236b0);
                C0941Ox c0941OxM9954b = ConstraintLayout.m9954b();
                c0546If2.m5486g();
                c1255Tx2.m7827a(c0941OxM9954b);
                constraintLayout.addView(c0546If2, c0941OxM9954b);
            }
            if (c1318Ux2.f12233a) {
                View c9445g20 = new C9445g20(constraintLayout.getContext());
                c9445g20.setId(num.intValue());
                C0941Ox c0941OxM9954b2 = ConstraintLayout.m9954b();
                c1255Tx2.m7827a(c0941OxM9954b2);
                constraintLayout.addView(c9445g20, c0941OxM9954b2);
            }
        }
    }

    /* renamed from: b */
    public final void m9434b(ConstraintLayout constraintLayout) {
        C1570Yx c1570Yx = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c1570Yx.f14625c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0941Ox c0941Ox = (C0941Ox) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1570Yx.f14624b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1255Tx());
            }
            C1255Tx c1255Tx = (C1255Tx) map.get(Integer.valueOf(id));
            HashMap map2 = c1570Yx.f14623a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                C0690Kx c0690Kx = (C0690Kx) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new C0690Kx(c0690Kx, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map3.put(str, new C0690Kx(c0690Kx, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            c1255Tx.f11604f = map3;
            c1255Tx.f11599a = id;
            int i2 = c0941Ox.f8728d;
            C1318Ux c1318Ux = c1255Tx.f11602d;
            c1318Ux.f12245g = i2;
            c1318Ux.f12247h = c0941Ox.f8730e;
            c1318Ux.f12249i = c0941Ox.f8732f;
            c1318Ux.f12251j = c0941Ox.f8734g;
            c1318Ux.f12252k = c0941Ox.f8736h;
            c1318Ux.f12253l = c0941Ox.f8738i;
            c1318Ux.f12254m = c0941Ox.f8740j;
            c1318Ux.f12255n = c0941Ox.f8742k;
            c1318Ux.f12256o = c0941Ox.f8744l;
            c1318Ux.f12257p = c0941Ox.f8748p;
            c1318Ux.f12258q = c0941Ox.f8749q;
            c1318Ux.f12259r = c0941Ox.f8750r;
            c1318Ux.f12260s = c0941Ox.f8751s;
            c1318Ux.f12261t = c0941Ox.f8758z;
            c1318Ux.f12262u = c0941Ox.f8696A;
            c1318Ux.f12263v = c0941Ox.f8697B;
            c1318Ux.f12264w = c0941Ox.f8745m;
            c1318Ux.f12265x = c0941Ox.f8746n;
            c1318Ux.f12266y = c0941Ox.f8747o;
            c1318Ux.f12267z = c0941Ox.f8711P;
            c1318Ux.f12207A = c0941Ox.f8712Q;
            c1318Ux.f12208B = c0941Ox.f8713R;
            c1318Ux.f12243f = c0941Ox.f8726c;
            c1318Ux.f12239d = c0941Ox.f8722a;
            c1318Ux.f12241e = c0941Ox.f8724b;
            c1318Ux.f12235b = ((ViewGroup.MarginLayoutParams) c0941Ox).width;
            c1318Ux.f12237c = ((ViewGroup.MarginLayoutParams) c0941Ox).height;
            c1318Ux.f12209C = ((ViewGroup.MarginLayoutParams) c0941Ox).leftMargin;
            c1318Ux.f12210D = ((ViewGroup.MarginLayoutParams) c0941Ox).rightMargin;
            c1318Ux.f12211E = ((ViewGroup.MarginLayoutParams) c0941Ox).topMargin;
            c1318Ux.f12212F = ((ViewGroup.MarginLayoutParams) c0941Ox).bottomMargin;
            c1318Ux.f12221O = c0941Ox.f8700E;
            c1318Ux.f12222P = c0941Ox.f8699D;
            c1318Ux.f12224R = c0941Ox.f8702G;
            c1318Ux.f12223Q = c0941Ox.f8701F;
            c1318Ux.f12246g0 = c0941Ox.f8714S;
            c1318Ux.f12248h0 = c0941Ox.f8715T;
            c1318Ux.f12225S = c0941Ox.f8703H;
            c1318Ux.f12226T = c0941Ox.f8704I;
            c1318Ux.f12227U = c0941Ox.f8707L;
            c1318Ux.f12228V = c0941Ox.f8708M;
            c1318Ux.f12229W = c0941Ox.f8705J;
            c1318Ux.f12230X = c0941Ox.f8706K;
            c1318Ux.f12231Y = c0941Ox.f8709N;
            c1318Ux.f12232Z = c0941Ox.f8710O;
            c1318Ux.f12244f0 = c0941Ox.f8716U;
            c1318Ux.f12216J = c0941Ox.f8753u;
            c1318Ux.f12218L = c0941Ox.f8755w;
            c1318Ux.f12215I = c0941Ox.f8752t;
            c1318Ux.f12217K = c0941Ox.f8754v;
            c1318Ux.f12220N = c0941Ox.f8756x;
            c1318Ux.f12219M = c0941Ox.f8757y;
            c1318Ux.f12213G = c0941Ox.getMarginEnd();
            c1318Ux.f12214H = c0941Ox.getMarginStart();
            int visibility = childAt.getVisibility();
            C1444Wx c1444Wx = c1255Tx.f11600b;
            c1444Wx.f13461a = visibility;
            c1444Wx.f13463c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            C1507Xx c1507Xx = c1255Tx.f11603e;
            c1507Xx.f14053a = rotation;
            c1507Xx.f14054b = childAt.getRotationX();
            c1507Xx.f14055c = childAt.getRotationY();
            c1507Xx.f14056d = childAt.getScaleX();
            c1507Xx.f14057e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != ConfigValue.DOUBLE_DEFAULT_VALUE || pivotY != ConfigValue.DOUBLE_DEFAULT_VALUE) {
                c1507Xx.f14058f = pivotX;
                c1507Xx.f14059g = pivotY;
            }
            c1507Xx.f14060h = childAt.getTranslationX();
            c1507Xx.f14061i = childAt.getTranslationY();
            c1507Xx.f14062j = childAt.getTranslationZ();
            if (c1507Xx.f14063k) {
                c1507Xx.f14064l = childAt.getElevation();
            }
            if (childAt instanceof C0546If) {
                C0546If c0546If = (C0546If) childAt;
                c1318Ux.f12250i0 = c0546If.f5068i.f5663g0;
                c1318Ux.f12240d0 = c0546If.getReferencedIds();
                c1318Ux.f12234a0 = c0546If.getType();
                c1318Ux.f12236b0 = c0546If.getMargin();
            }
            i++;
            c1570Yx = this;
        }
    }

    /* renamed from: e */
    public final void m9435e(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1255Tx c1255TxM9431d = m9431d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1255TxM9431d.f11602d.f12233a = true;
                    }
                    this.f14625c.put(Integer.valueOf(c1255TxM9431d.f11599a), c1255TxM9431d);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
