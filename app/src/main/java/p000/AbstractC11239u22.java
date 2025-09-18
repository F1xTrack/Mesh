package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: u22 */
/* loaded from: classes.dex */
public abstract class AbstractC11239u22 {
    /* renamed from: a */
    public static Object m25078a(String str, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    /* renamed from: b */
    public static Object m25079b(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: c */
    public static void m25080c(List list, InterfaceC11895zC0 interfaceC11895zC0, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (interfaceC11895zC0.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: d */
    public static String m25081d(JE1 je1) {
        StringBuilder sb = new StringBuilder(je1.mo3006i());
        for (int i = 0; i < je1.mo3006i(); i++) {
            byte bMo3004b = je1.mo3004b(i);
            if (bMo3004b == 34) {
                sb.append("\\\"");
            } else if (bMo3004b == 39) {
                sb.append("\\'");
            } else if (bMo3004b != 92) {
                switch (bMo3004b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo3004b < 32 || bMo3004b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo3004b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo3004b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo3004b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo3004b);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
