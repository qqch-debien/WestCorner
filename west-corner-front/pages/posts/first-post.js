import Link from 'next/link'
import Head from 'next/head'
import Layout from '../../components/Layout'

export default function FirstPost () {
	return <div>
			<Layout>
				<Head>
					<title>First Post</title>
				</Head>
				<h1>First Post</h1>
				<Link href="/">
					<a>Back to home</a>
				</Link>
			</Layout>
		</div>
}
