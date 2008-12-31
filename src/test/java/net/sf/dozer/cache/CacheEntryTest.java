/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.dozer.cache;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.sf.dozer.AbstractDozerTest;

/**
 * @author tierney.matt
 */
public class CacheEntryTest extends AbstractDozerTest {

  @Test
  public void testConstructor() throws Exception {
    String key = getRandomString();
    String value = getRandomString();
    CacheEntry cacheEntry = new CacheEntry(key, value);

    assertEquals("invalid key", key, cacheEntry.getKey());
    assertEquals("invalid value", value, cacheEntry.getValue());    
  }

  @Test
  public void testHashCodeAndEquals() throws Exception {
    String key = getRandomString();
    String value = getRandomString();
    CacheEntry cacheEntry = new CacheEntry(key, value);
    CacheEntry cacheEntry2 = new CacheEntry(key, value);

    assertEquals("cache entries hash code should have been equal", cacheEntry.hashCode(), cacheEntry2.hashCode());
    assertEquals("cache entries should have been equal", cacheEntry, cacheEntry2);
  }

}