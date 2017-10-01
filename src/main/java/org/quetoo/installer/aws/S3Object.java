package org.quetoo.installer.aws;

import static org.quetoo.installer.aws.S3.getLong;
import static org.quetoo.installer.aws.S3.getString;

import org.quetoo.installer.Asset;
import org.w3c.dom.Node;

/**
 * An abstraction for an object residing in an {@link S3Bucket}.
 * 
 * @author jdolan
 */
public class S3Object implements Asset {

	private static final String KEY = "Key";
	private static final String ETAG = "ETag";
	private static final String SIZE = "Size";

	private final String key;
	private final String etag;
	private final long size;

	/**
	 * Instantiates an {@link S3Object} from the given XML node.
	 * 
	 * @param node A `Contents` node of an S3 bucket listing.
	 */
	public S3Object(final Node node) {
		key = getString(node, KEY);
		etag = getString(node, ETAG).replaceAll("\"", "");
		size = getLong(node, SIZE);
	}

	@Override
	public String name() {
		return getKey();
	}

	@Override
	public long size() {
		return getSize();
	}

	@Override
	public boolean isDirectory() {
		return key.endsWith("/");
	}

	@Override
	public String toString() {
		return key;
	}

	public String getKey() {
		return key;
	}

	public String getEtag() {
		return etag;
	}

	public long getSize() {
		return size;
	}
}
