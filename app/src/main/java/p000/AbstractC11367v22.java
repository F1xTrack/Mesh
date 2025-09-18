package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.core.base.AidlException;
import com.swmansion.reanimated.BuildConfig;
import io.appmetrica.analytics.impl.C5043c9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: v22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11367v22 {
    /* renamed from: a */
    public static final C7546Em0 m25309a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String name = ((C7546Em0) obj2).f2897a.getName();
            O90.m5967e(name, "file.name");
            if (C51.m979f(name) != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                String name2 = ((C7546Em0) next).f2897a.getName();
                O90.m5967e(name2, "file.name");
                int i = Integer.parseInt(name2);
                do {
                    Object next2 = it.next();
                    String name3 = ((C7546Em0) next2).f2897a.getName();
                    O90.m5967e(name3, "file.name");
                    int i2 = Integer.parseInt(name3);
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C7546Em0) obj;
    }

    /* renamed from: b */
    public static int m25310b(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case C5043c9.f31374J /* 35 */:
                return 36;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                return 37;
            case 37:
                return 38;
            case C5043c9.f31375K /* 38 */:
                return 39;
            case 39:
                return 40;
            case C5043c9.f31376L /* 40 */:
                return 41;
            case 41:
                return 42;
            case C5043c9.f31377M /* 42 */:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case NativeMac.KEY_LENGTH /* 64 */:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 75 */:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return AidlException.ILLEGAL_ARGUMENT_EXCEPTION;
                    case AidlException.ILLEGAL_ARGUMENT_EXCEPTION /* 101 */:
                        return 102;
                    case 102:
                        return AidlException.HOST_IS_NOT_MASTER;
                    case AidlException.HOST_IS_NOT_MASTER /* 103 */:
                        return 104;
                    default:
                        return 0;
                }
        }
    }
}
