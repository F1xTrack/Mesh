package defpackage;

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
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.swmansion.reanimated.BuildConfig;
import com.vk.push.core.base.AidlException;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C4473c9;
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
public final class C1960Yx {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
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

    public static int[] c(C0659If c0659If, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        Context context = c0659If.getContext();
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
                iIntValue = context.getResources().getIdentifier(strTrim, NotificationConstants.ID, context.getPackageName());
            }
            if (iIntValue == 0 && c0659If.isInEditMode() && (c0659If.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0659If.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.m) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.m.get(strTrim);
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

    public static C1570Tx d(Context context, AttributeSet attributeSet) {
        C1570Tx c1570Tx = new C1570Tx();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C1804Wx c1804Wx = c1570Tx.b;
            C1726Vx c1726Vx = c1570Tx.c;
            C1882Xx c1882Xx = c1570Tx.e;
            C1648Ux c1648Ux = c1570Tx.d;
            if (index != 1 && 23 != index && 24 != index) {
                c1726Vx.getClass();
                c1648Ux.getClass();
                c1882Xx.getClass();
            }
            SparseIntArray sparseIntArray = e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1648Ux.o = f(typedArrayObtainStyledAttributes, index, c1648Ux.o);
                    break;
                case 2:
                    c1648Ux.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.F);
                    break;
                case 3:
                    c1648Ux.n = f(typedArrayObtainStyledAttributes, index, c1648Ux.n);
                    break;
                case 4:
                    c1648Ux.m = f(typedArrayObtainStyledAttributes, index, c1648Ux.m);
                    break;
                case 5:
                    c1648Ux.v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c1648Ux.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1648Ux.z);
                    break;
                case 7:
                    c1648Ux.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1648Ux.A);
                    break;
                case 8:
                    c1648Ux.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.G);
                    break;
                case 9:
                    c1648Ux.s = f(typedArrayObtainStyledAttributes, index, c1648Ux.s);
                    break;
                case 10:
                    c1648Ux.r = f(typedArrayObtainStyledAttributes, index, c1648Ux.r);
                    break;
                case 11:
                    c1648Ux.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.L);
                    break;
                case 12:
                    c1648Ux.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.M);
                    break;
                case 13:
                    c1648Ux.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.I);
                    break;
                case 14:
                    c1648Ux.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.K);
                    break;
                case 15:
                    c1648Ux.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.N);
                    break;
                case 16:
                    c1648Ux.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.J);
                    break;
                case 17:
                    c1648Ux.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1648Ux.d);
                    break;
                case 18:
                    c1648Ux.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1648Ux.e);
                    break;
                case 19:
                    c1648Ux.f = typedArrayObtainStyledAttributes.getFloat(index, c1648Ux.f);
                    break;
                case 20:
                    c1648Ux.t = typedArrayObtainStyledAttributes.getFloat(index, c1648Ux.t);
                    break;
                case 21:
                    c1648Ux.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1648Ux.c);
                    break;
                case 22:
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, c1804Wx.a);
                    c1804Wx.a = i2;
                    c1804Wx.a = d[i2];
                    break;
                case 23:
                    c1648Ux.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1648Ux.b);
                    break;
                case 24:
                    c1648Ux.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.C);
                    break;
                case 25:
                    c1648Ux.g = f(typedArrayObtainStyledAttributes, index, c1648Ux.g);
                    break;
                case 26:
                    c1648Ux.h = f(typedArrayObtainStyledAttributes, index, c1648Ux.h);
                    break;
                case 27:
                    c1648Ux.B = typedArrayObtainStyledAttributes.getInt(index, c1648Ux.B);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    c1648Ux.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.D);
                    break;
                case 29:
                    c1648Ux.i = f(typedArrayObtainStyledAttributes, index, c1648Ux.i);
                    break;
                case 30:
                    c1648Ux.j = f(typedArrayObtainStyledAttributes, index, c1648Ux.j);
                    break;
                case 31:
                    c1648Ux.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.H);
                    break;
                case 32:
                    c1648Ux.p = f(typedArrayObtainStyledAttributes, index, c1648Ux.p);
                    break;
                case 33:
                    c1648Ux.q = f(typedArrayObtainStyledAttributes, index, c1648Ux.q);
                    break;
                case 34:
                    c1648Ux.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.E);
                    break;
                case C4473c9.J /* 35 */:
                    c1648Ux.l = f(typedArrayObtainStyledAttributes, index, c1648Ux.l);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    c1648Ux.k = f(typedArrayObtainStyledAttributes, index, c1648Ux.k);
                    break;
                case 37:
                    c1648Ux.u = typedArrayObtainStyledAttributes.getFloat(index, c1648Ux.u);
                    break;
                case C4473c9.K /* 38 */:
                    c1570Tx.a = typedArrayObtainStyledAttributes.getResourceId(index, c1570Tx.a);
                    break;
                case 39:
                    c1648Ux.P = typedArrayObtainStyledAttributes.getFloat(index, c1648Ux.P);
                    break;
                case C4473c9.L /* 40 */:
                    c1648Ux.O = typedArrayObtainStyledAttributes.getFloat(index, c1648Ux.O);
                    break;
                case 41:
                    c1648Ux.Q = typedArrayObtainStyledAttributes.getInt(index, c1648Ux.Q);
                    break;
                case C4473c9.M /* 42 */:
                    c1648Ux.R = typedArrayObtainStyledAttributes.getInt(index, c1648Ux.R);
                    break;
                case 43:
                    c1804Wx.c = typedArrayObtainStyledAttributes.getFloat(index, c1804Wx.c);
                    break;
                case 44:
                    c1882Xx.k = true;
                    c1882Xx.l = typedArrayObtainStyledAttributes.getDimension(index, c1882Xx.l);
                    break;
                case 45:
                    c1882Xx.b = typedArrayObtainStyledAttributes.getFloat(index, c1882Xx.b);
                    break;
                case 46:
                    c1882Xx.c = typedArrayObtainStyledAttributes.getFloat(index, c1882Xx.c);
                    break;
                case 47:
                    c1882Xx.d = typedArrayObtainStyledAttributes.getFloat(index, c1882Xx.d);
                    break;
                case 48:
                    c1882Xx.e = typedArrayObtainStyledAttributes.getFloat(index, c1882Xx.e);
                    break;
                case 49:
                    c1882Xx.f = typedArrayObtainStyledAttributes.getDimension(index, c1882Xx.f);
                    break;
                case 50:
                    c1882Xx.g = typedArrayObtainStyledAttributes.getDimension(index, c1882Xx.g);
                    break;
                case 51:
                    c1882Xx.h = typedArrayObtainStyledAttributes.getDimension(index, c1882Xx.h);
                    break;
                case 52:
                    c1882Xx.i = typedArrayObtainStyledAttributes.getDimension(index, c1882Xx.i);
                    break;
                case 53:
                    c1882Xx.j = typedArrayObtainStyledAttributes.getDimension(index, c1882Xx.j);
                    break;
                case 54:
                    c1648Ux.S = typedArrayObtainStyledAttributes.getInt(index, c1648Ux.S);
                    break;
                case 55:
                    c1648Ux.T = typedArrayObtainStyledAttributes.getInt(index, c1648Ux.T);
                    break;
                case 56:
                    c1648Ux.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.U);
                    break;
                case 57:
                    c1648Ux.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.V);
                    break;
                case 58:
                    c1648Ux.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.W);
                    break;
                case 59:
                    c1648Ux.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.X);
                    break;
                case 60:
                    c1882Xx.a = typedArrayObtainStyledAttributes.getFloat(index, c1882Xx.a);
                    break;
                case 61:
                    c1648Ux.w = f(typedArrayObtainStyledAttributes, index, c1648Ux.w);
                    break;
                case 62:
                    c1648Ux.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.x);
                    break;
                case 63:
                    c1648Ux.y = typedArrayObtainStyledAttributes.getFloat(index, c1648Ux.y);
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    c1726Vx.a = f(typedArrayObtainStyledAttributes, index, c1726Vx.a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c1726Vx.getClass();
                        break;
                    } else {
                        String str = AbstractC5340ja1.a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c1726Vx.getClass();
                        break;
                    }
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1726Vx.getClass();
                    break;
                case 67:
                    c1726Vx.d = typedArrayObtainStyledAttributes.getFloat(index, c1726Vx.d);
                    break;
                case 68:
                    c1804Wx.d = typedArrayObtainStyledAttributes.getFloat(index, c1804Wx.d);
                    break;
                case 69:
                    c1648Ux.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1648Ux.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c1648Ux.a0 = typedArrayObtainStyledAttributes.getInt(index, c1648Ux.a0);
                    break;
                case 73:
                    c1648Ux.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1648Ux.b0);
                    break;
                case 74:
                    c1648Ux.e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
                    c1648Ux.i0 = typedArrayObtainStyledAttributes.getBoolean(index, c1648Ux.i0);
                    break;
                case 76:
                    c1726Vx.b = typedArrayObtainStyledAttributes.getInt(index, c1726Vx.b);
                    break;
                case 77:
                    c1648Ux.f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c1804Wx.b = typedArrayObtainStyledAttributes.getInt(index, c1804Wx.b);
                    break;
                case 79:
                    c1726Vx.c = typedArrayObtainStyledAttributes.getFloat(index, c1726Vx.c);
                    break;
                case 80:
                    c1648Ux.g0 = typedArrayObtainStyledAttributes.getBoolean(index, c1648Ux.g0);
                    break;
                case 81:
                    c1648Ux.h0 = typedArrayObtainStyledAttributes.getBoolean(index, c1648Ux.h0);
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
        return c1570Tx;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.c;
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
                if (this.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C1570Tx c1570Tx = (C1570Tx) map.get(Integer.valueOf(id));
                    if (childAt instanceof C0659If) {
                        c1570Tx.d.c0 = 1;
                    }
                    int i2 = c1570Tx.d.c0;
                    if (i2 != -1 && i2 == 1) {
                        C0659If c0659If = (C0659If) childAt;
                        c0659If.setId(id);
                        C1648Ux c1648Ux = c1570Tx.d;
                        c0659If.setType(c1648Ux.a0);
                        c0659If.setMargin(c1648Ux.b0);
                        c0659If.setAllowsGoneWidget(c1648Ux.i0);
                        int[] iArr = c1648Ux.d0;
                        if (iArr != null) {
                            c0659If.setReferencedIds(iArr);
                        } else {
                            String str = c1648Ux.e0;
                            if (str != null) {
                                int[] iArrC = c(c0659If, str);
                                c1648Ux.d0 = iArrC;
                                c0659If.setReferencedIds(iArrC);
                            }
                        }
                    }
                    C1180Ox c1180Ox = (C1180Ox) childAt.getLayoutParams();
                    c1180Ox.a();
                    c1570Tx.a(c1180Ox);
                    HashMap map2 = c1570Tx.f;
                    Class<?> cls = childAt.getClass();
                    for (String str2 : map2.keySet()) {
                        C0869Kx c0869Kx = (C0869Kx) map2.get(str2);
                        String strV = AbstractC8235ym.v("set", str2);
                        try {
                            switch (AbstractC8235ym.x(c0869Kx.a)) {
                                case 0:
                                    cls.getMethod(strV, Integer.TYPE).invoke(childAt, Integer.valueOf(c0869Kx.b));
                                    break;
                                case 1:
                                    cls.getMethod(strV, Float.TYPE).invoke(childAt, Float.valueOf(c0869Kx.c));
                                    break;
                                case 2:
                                    cls.getMethod(strV, Integer.TYPE).invoke(childAt, Integer.valueOf(c0869Kx.f));
                                    break;
                                case 3:
                                    Method method = cls.getMethod(strV, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(c0869Kx.f);
                                    method.invoke(childAt, colorDrawable);
                                    break;
                                case 4:
                                    cls.getMethod(strV, CharSequence.class).invoke(childAt, c0869Kx.d);
                                    break;
                                case 5:
                                    cls.getMethod(strV, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0869Kx.e));
                                    break;
                                case 6:
                                    cls.getMethod(strV, Float.TYPE).invoke(childAt, Float.valueOf(c0869Kx.c));
                                    break;
                            }
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e3.getMessage();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(c1180Ox);
                    C1804Wx c1804Wx = c1570Tx.b;
                    if (c1804Wx.b == 0) {
                        childAt.setVisibility(c1804Wx.a);
                    }
                    childAt.setAlpha(c1804Wx.c);
                    C1882Xx c1882Xx = c1570Tx.e;
                    childAt.setRotation(c1882Xx.a);
                    childAt.setRotationX(c1882Xx.b);
                    childAt.setRotationY(c1882Xx.c);
                    childAt.setScaleX(c1882Xx.d);
                    childAt.setScaleY(c1882Xx.e);
                    if (!Float.isNaN(c1882Xx.f)) {
                        childAt.setPivotX(c1882Xx.f);
                    }
                    if (!Float.isNaN(c1882Xx.g)) {
                        childAt.setPivotY(c1882Xx.g);
                    }
                    childAt.setTranslationX(c1882Xx.h);
                    childAt.setTranslationY(c1882Xx.i);
                    childAt.setTranslationZ(c1882Xx.j);
                    if (c1882Xx.k) {
                        childAt.setElevation(c1882Xx.l);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1570Tx c1570Tx2 = (C1570Tx) map.get(num);
            C1648Ux c1648Ux2 = c1570Tx2.d;
            int i3 = c1648Ux2.c0;
            if (i3 != -1 && i3 == 1) {
                Context context = constraintLayout.getContext();
                C0659If c0659If2 = new C0659If(context);
                c0659If2.a = new int[32];
                c0659If2.f = new HashMap();
                c0659If2.c = context;
                C0737Jf c0737Jf = new C0737Jf();
                c0737Jf.f0 = 0;
                c0737Jf.g0 = true;
                c0737Jf.h0 = 0;
                c0659If2.i = c0737Jf;
                c0659If2.d = c0737Jf;
                c0659If2.g();
                c0659If2.setVisibility(8);
                c0659If2.setId(num.intValue());
                int[] iArr2 = c1648Ux2.d0;
                if (iArr2 != null) {
                    c0659If2.setReferencedIds(iArr2);
                } else {
                    String str3 = c1648Ux2.e0;
                    if (str3 != null) {
                        int[] iArrC2 = c(c0659If2, str3);
                        c1648Ux2.d0 = iArrC2;
                        c0659If2.setReferencedIds(iArrC2);
                    }
                }
                c0659If2.setType(c1648Ux2.a0);
                c0659If2.setMargin(c1648Ux2.b0);
                C1180Ox c1180OxB = ConstraintLayout.b();
                c0659If2.g();
                c1570Tx2.a(c1180OxB);
                constraintLayout.addView(c0659If2, c1180OxB);
            }
            if (c1648Ux2.a) {
                View c3886g20 = new C3886g20(constraintLayout.getContext());
                c3886g20.setId(num.intValue());
                C1180Ox c1180OxB2 = ConstraintLayout.b();
                c1570Tx2.a(c1180OxB2);
                constraintLayout.addView(c3886g20, c1180OxB2);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        C1960Yx c1960Yx = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c1960Yx.c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C1180Ox c1180Ox = (C1180Ox) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1960Yx.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1570Tx());
            }
            C1570Tx c1570Tx = (C1570Tx) map.get(Integer.valueOf(id));
            HashMap map2 = c1960Yx.a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                C0869Kx c0869Kx = (C0869Kx) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new C0869Kx(c0869Kx, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map3.put(str, new C0869Kx(c0869Kx, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            }
            c1570Tx.f = map3;
            c1570Tx.a = id;
            int i2 = c1180Ox.d;
            C1648Ux c1648Ux = c1570Tx.d;
            c1648Ux.g = i2;
            c1648Ux.h = c1180Ox.e;
            c1648Ux.i = c1180Ox.f;
            c1648Ux.j = c1180Ox.g;
            c1648Ux.k = c1180Ox.h;
            c1648Ux.l = c1180Ox.i;
            c1648Ux.m = c1180Ox.j;
            c1648Ux.n = c1180Ox.k;
            c1648Ux.o = c1180Ox.l;
            c1648Ux.p = c1180Ox.p;
            c1648Ux.q = c1180Ox.q;
            c1648Ux.r = c1180Ox.r;
            c1648Ux.s = c1180Ox.s;
            c1648Ux.t = c1180Ox.z;
            c1648Ux.u = c1180Ox.A;
            c1648Ux.v = c1180Ox.B;
            c1648Ux.w = c1180Ox.m;
            c1648Ux.x = c1180Ox.n;
            c1648Ux.y = c1180Ox.o;
            c1648Ux.z = c1180Ox.P;
            c1648Ux.A = c1180Ox.Q;
            c1648Ux.B = c1180Ox.R;
            c1648Ux.f = c1180Ox.c;
            c1648Ux.d = c1180Ox.a;
            c1648Ux.e = c1180Ox.b;
            c1648Ux.b = ((ViewGroup.MarginLayoutParams) c1180Ox).width;
            c1648Ux.c = ((ViewGroup.MarginLayoutParams) c1180Ox).height;
            c1648Ux.C = ((ViewGroup.MarginLayoutParams) c1180Ox).leftMargin;
            c1648Ux.D = ((ViewGroup.MarginLayoutParams) c1180Ox).rightMargin;
            c1648Ux.E = ((ViewGroup.MarginLayoutParams) c1180Ox).topMargin;
            c1648Ux.F = ((ViewGroup.MarginLayoutParams) c1180Ox).bottomMargin;
            c1648Ux.O = c1180Ox.E;
            c1648Ux.P = c1180Ox.D;
            c1648Ux.R = c1180Ox.G;
            c1648Ux.Q = c1180Ox.F;
            c1648Ux.g0 = c1180Ox.S;
            c1648Ux.h0 = c1180Ox.T;
            c1648Ux.S = c1180Ox.H;
            c1648Ux.T = c1180Ox.I;
            c1648Ux.U = c1180Ox.L;
            c1648Ux.V = c1180Ox.M;
            c1648Ux.W = c1180Ox.J;
            c1648Ux.X = c1180Ox.K;
            c1648Ux.Y = c1180Ox.N;
            c1648Ux.Z = c1180Ox.O;
            c1648Ux.f0 = c1180Ox.U;
            c1648Ux.J = c1180Ox.u;
            c1648Ux.L = c1180Ox.w;
            c1648Ux.I = c1180Ox.t;
            c1648Ux.K = c1180Ox.v;
            c1648Ux.N = c1180Ox.x;
            c1648Ux.M = c1180Ox.y;
            c1648Ux.G = c1180Ox.getMarginEnd();
            c1648Ux.H = c1180Ox.getMarginStart();
            int visibility = childAt.getVisibility();
            C1804Wx c1804Wx = c1570Tx.b;
            c1804Wx.a = visibility;
            c1804Wx.c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            C1882Xx c1882Xx = c1570Tx.e;
            c1882Xx.a = rotation;
            c1882Xx.b = childAt.getRotationX();
            c1882Xx.c = childAt.getRotationY();
            c1882Xx.d = childAt.getScaleX();
            c1882Xx.e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != ConfigValue.DOUBLE_DEFAULT_VALUE || pivotY != ConfigValue.DOUBLE_DEFAULT_VALUE) {
                c1882Xx.f = pivotX;
                c1882Xx.g = pivotY;
            }
            c1882Xx.h = childAt.getTranslationX();
            c1882Xx.i = childAt.getTranslationY();
            c1882Xx.j = childAt.getTranslationZ();
            if (c1882Xx.k) {
                c1882Xx.l = childAt.getElevation();
            }
            if (childAt instanceof C0659If) {
                C0659If c0659If = (C0659If) childAt;
                c1648Ux.i0 = c0659If.i.g0;
                c1648Ux.d0 = c0659If.getReferencedIds();
                c1648Ux.a0 = c0659If.getType();
                c1648Ux.b0 = c0659If.getMargin();
            }
            i++;
            c1960Yx = this;
        }
    }

    public final void e(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1570Tx c1570TxD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1570TxD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(c1570TxD.a), c1570TxD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
