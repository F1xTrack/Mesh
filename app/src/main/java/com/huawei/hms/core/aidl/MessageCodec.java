package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MessageCodec {
    protected static final int VAL_ENTITY = 0;
    protected static final int VAL_LIST = 1;
    protected static final int VAL_NULL = -1;
    protected static final String VAL_TYPE = "_val_type_";

    /* renamed from: a */
    private void m11654a(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Object objM11653a = m11653a(field, bundle);
        if (objM11653a != null) {
            boolean zIsAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(iMessageEntity, objM11653a);
            field.setAccessible(zIsAccessible);
        }
    }

    /* renamed from: b */
    private void m11656b(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException, SecurityException {
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        writeValue(field.getName(), field.get(iMessageEntity), bundle);
        field.setAccessible(zIsAccessible);
    }

    public IMessageEntity decode(Bundle bundle, IMessageEntity iMessageEntity) {
        if (bundle == null) {
            return iMessageEntity;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        m11654a(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        field.getName();
                    }
                }
            }
        }
        return iMessageEntity;
    }

    public Bundle encode(IMessageEntity iMessageEntity, Bundle bundle) {
        if (iMessageEntity == null) {
            return bundle;
        }
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        m11656b(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        field.getName();
                    }
                }
            }
        }
        return bundle;
    }

    public List<Object> readList(Type type, Bundle bundle) throws IllegalAccessException, InstantiationException {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle2 = bundle.getBundle("_next_item_"); bundle2 != null; bundle2 = bundle2.getBundle("_next_item_")) {
            Object obj = bundle2.get("_value_");
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (obj instanceof Bundle) {
                Bundle bundle3 = (Bundle) obj;
                int i = bundle3.getInt(VAL_TYPE, -1);
                if (i == 1) {
                    throw new InstantiationException("Nested List can not be supported");
                }
                if (i != 0) {
                    throw new InstantiationException("Unknown type can not be supported");
                }
                arrayList.add(decode(bundle3, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else {
                continue;
            }
        }
        return arrayList;
    }

    public void writeList(String str, List list, Bundle bundle) {
        Bundle bundleM11652a = null;
        for (Object obj : list) {
            if (bundleM11652a == null) {
                bundleM11652a = new Bundle();
                bundle.putBundle(str, bundleM11652a);
                bundleM11652a.putInt(VAL_TYPE, 1);
            }
            bundleM11652a = m11652a("_value_", bundleM11652a, obj);
        }
    }

    public void writeValue(String str, Object obj, Bundle bundle) {
        if (obj == null || m11655a(str, obj, bundle)) {
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
            return;
        }
        if (obj instanceof List) {
            writeList(str, (List) obj, bundle);
            return;
        }
        if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else if (obj instanceof IMessageEntity) {
            Bundle bundleEncode = encode((IMessageEntity) obj, new Bundle());
            bundleEncode.putInt(VAL_TYPE, 0);
            bundle.putBundle(str, bundleEncode);
        }
    }

    /* renamed from: a */
    private Object m11653a(Field field, Bundle bundle) {
        Object obj = bundle.get(field.getName());
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i = bundle2.getInt(VAL_TYPE, -1);
                if (i == 1) {
                    return readList(field.getGenericType(), bundle2);
                }
                if (i == 0) {
                    return decode((Bundle) obj, (IMessageEntity) field.getType().newInstance());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return obj;
    }

    /* renamed from: a */
    private Bundle m11652a(String str, Bundle bundle, Object obj) {
        Bundle bundle2 = new Bundle();
        writeValue(str, obj, bundle2);
        bundle.putBundle("_next_item_", bundle2);
        return bundle2;
    }

    /* renamed from: a */
    private boolean m11655a(String str, Object obj, Bundle bundle) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        return true;
    }
}
