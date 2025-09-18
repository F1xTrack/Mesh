package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.SparseArray;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.AbstractC7421Cb1;
import p000.AbstractC9104dM1;

/* loaded from: classes.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    private final char[] mEmojiCharArray;
    private final MetadataList mMetadataList;
    private final Node mRootNode = new Node(DEFAULT_ROOT_SIZE);
    private final Typeface mTypeface;

    public static class Node {
        private final SparseArray<Node> mChildren;
        private TypefaceEmojiRasterizer mData;

        private Node() {
            this(1);
        }

        public Node get(int i) {
            SparseArray<Node> sparseArray = this.mChildren;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final TypefaceEmojiRasterizer getData() {
            return this.mData;
        }

        public void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            Node node = get(typefaceEmojiRasterizer.getCodepointAt(i));
            if (node == null) {
                node = new Node();
                this.mChildren.put(typefaceEmojiRasterizer.getCodepointAt(i), node);
            }
            if (i2 > i) {
                node.put(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.mData = typefaceEmojiRasterizer;
            }
        }

        public Node(int i) {
            this.mChildren = new SparseArray<>(i);
        }
    }

    private MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[metadataList.listLength() * 2];
        constructIndex(metadataList);
    }

    private void constructIndex(MetadataList metadataList) {
        int iListLength = metadataList.listLength();
        for (int i = 0; i < iListLength; i++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i);
            Character.toChars(typefaceEmojiRasterizer.getId(), this.mEmojiCharArray, i * 2);
            put(typefaceEmojiRasterizer);
        }
    }

    public static MetadataRepo create(Typeface typeface) {
        try {
            int i = AbstractC7421Cb1.f1471a;
            Trace.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(typeface, new MetadataList());
            Trace.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            int i2 = AbstractC7421Cb1.f1471a;
            Trace.endSection();
            throw th;
        }
    }

    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    public MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    public int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    public Node getRootNode() {
        return this.mRootNode;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        AbstractC9104dM1.m17549h(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        AbstractC9104dM1.m17545d("invalid metadata codepoint length", typefaceEmojiRasterizer.getCodepointsLength() > 0);
        this.mRootNode.put(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
    }

    public static MetadataRepo create(Typeface typeface, InputStream inputStream) throws IOException {
        try {
            int i = AbstractC7421Cb1.f1471a;
            Trace.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(typeface, MetadataListReader.read(inputStream));
            Trace.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            int i2 = AbstractC7421Cb1.f1471a;
            Trace.endSection();
            throw th;
        }
    }

    public static MetadataRepo create(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            int i = AbstractC7421Cb1.f1471a;
            Trace.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));
            Trace.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            int i2 = AbstractC7421Cb1.f1471a;
            Trace.endSection();
            throw th;
        }
    }

    public static MetadataRepo create(AssetManager assetManager, String str) throws IOException {
        try {
            int i = AbstractC7421Cb1.f1471a;
            Trace.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(Typeface.createFromAsset(assetManager, str), MetadataListReader.read(assetManager, str));
            Trace.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            int i2 = AbstractC7421Cb1.f1471a;
            Trace.endSection();
            throw th;
        }
    }
}
